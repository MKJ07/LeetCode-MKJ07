import java.util.HashMap;
import java.util.Map;
/*Question: 75. Sort Colors
Link: https://leetcode.com/problems/sort-colors/description/

Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]
*/
public class Lc75 {
    public void sortColors(int[] nums) {
        HashMap<Integer,Integer> h1=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(h1.containsKey(nums[i])){
                h1.put(nums[i],h1.get(nums[i])+1);
            }
            else{
                h1.put(nums[i],1);
            }
        }
        int i=0;
        for(Map.Entry<Integer,Integer> map:h1.entrySet()){
            int loop=0;
            while(loop<map.getValue()){
                nums[i]=map.getKey();
                loop++;
                i++;
            }
        }
    }
    public static void main(String[] args) {
        int[] nums={0,1,2,0,0,1,1,2};
        Lc75 t=new Lc75();
        t.sortColors(nums);
        for (int i : nums) {
            System.out.print(i+" ");
        }

    }
}
