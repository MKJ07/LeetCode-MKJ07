import java.util.*;
/*Question: 448. Find All Numbers Disappeared in an Array.
Link: https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array

Input: nums = [4,3,2,7,8,2,3,1]
Output: [5,6]
 */
public class Lc448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        /*This is the optimal approach having TC:O(n) and SC:O(1) */
        List<Integer> result = new ArrayList<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int num = Math.abs(nums[i]);
            if (nums[num - 1] > 0) {
                nums[num - 1] = -nums[num - 1];
            }
        }
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                result.add(i + 1);
            }
        }
        return result;

        /*This is the brute force approach having TC: O(n^2) and SC: O(1) 
        List<Integer> l=new ArrayList<>();
        for(int i=1;i<=nums.length;i++){
            int p=0;
            for(int j=0;j<nums.length;j++){
                if(i==nums[j]){
                    p=1;
                }
            }
            if(p==0){
                l.add(i);
            }
        }
        return l; */
    }
    public static void main(String[] args) {
        int[] nums={1, 2, 2, 3, 3, 3};
        Lc448 obj=new Lc448();
        System.out.println(obj.findDisappearedNumbers(nums));
    }
}
