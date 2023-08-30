import java.util.*;
/*Question: 229. Majority Element II.
Link: https://leetcode.com/problems/majority-element-ii/description/

Example 1:
Input: nums = [3,2,3]
Output: [3]

Example 2:
Input: nums = [1]
Output: [1]*/

public class Lc229 {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list=new ArrayList<>();
        HashMap<Integer,Integer> h1=new HashMap<>();
        int d=(int)Math.floor(nums.length/3)+1;
        for(int i=0;i<nums.length;i++){
            if(h1.containsKey(nums[i])){
                h1.put(nums[i],h1.get(nums[i])+1);
            }
            else{
                h1.put(nums[i],1);
            }
            if(h1.get(nums[i])==d){
                list.add(nums[i]);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] arr={3,2,3};
        Lc229 t=new Lc229();
        System.out.println(t.majorityElement(arr)); 
    }
}
