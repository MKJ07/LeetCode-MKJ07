import java.util.HashMap;
/*Question: 1. Two Sum
Link: https://leetcode.com/problems/two-sum/

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 */
public class Lc1 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> h1=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int find=target-nums[i];
            if(h1.containsKey(find)){
                return new int[]{h1.get(find),i};
            }
            else{
                h1.put(nums[i],i);
            }
        }
        return new int[]{0,0};
    }
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};int target = 9;
        Lc1 t=new Lc1();
        int[] res=t.twoSum(nums, target);
        for (int i : res) {
            System.out.print(i+" ");
        }
    }
}
