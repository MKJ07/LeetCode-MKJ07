import java.util.*;
/*Question: 169. Majority Element
Link:-https://leetcode.com/problems/majority-element/description/

Input: nums = [3,2,3]
Output: 3
Input: nums = [2,2,1,1,1,2,2]
Output: 2
 */
public class Lc169 {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> h1=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(h1.containsKey(nums[i])){
                h1.put(nums[i],h1.get(nums[i])+1);
            }
            else{
                h1.put(nums[i],1);
            }
        }
        int value=0;
        int max=Integer.MIN_VALUE;
        for(Map.Entry<Integer,Integer> m:h1.entrySet()){
            if(m.getValue()>max){
                max=m.getValue();
                value=m.getKey();
            }
        }
        return value;
    }
    public static void main(String[] args) {
        int[] arr={4,2,3,6,5,9,4,6,5,8,1,2,4,6,4};
        Lc169 t=new Lc169();
        System.out.println(t.majorityElement(arr));
    }
    
}
