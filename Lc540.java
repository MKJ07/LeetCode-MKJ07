import java.util.*;
/*Question: 540. Single Element in a Sorted Array
Link:-https://leetcode.com/problems/single-element-in-a-sorted-array/description/

Input: nums = [1,1,2,3,3,4,4,8,8]
Output: 2

Input: nums = [3,3,7,7,10,11,11]
Output: 10
 */
public class Lc540 {
    public int singleNonDuplicate(int[] nums) {
        HashMap<Integer,Integer> h1=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(h1.containsKey(nums[i])){
                h1.put(nums[i],h1.get(nums[i])+1);
            }
            else{
                h1.put(nums[i],1);
            }
        }
        int c=0;
        for(Map.Entry<Integer,Integer> m:h1.entrySet()){
            if(m.getValue()==1){
                c=m.getKey();
            }
            // System.out.println(m.getKey()+" "+m.getValue());
        }
        return c;
        
    }
    public static void main(String[] args) {
        int[] nums={3,3,7,7,10,11,11};
        Lc540 t=new Lc540();
        System.out.println(t.singleNonDuplicate(nums));
    }
}
