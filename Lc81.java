/*Question: 81. Search in Rotated Sorted Array II
Link: https://leetcode.com/problems/search-in-rotated-sorted-array-ii/description/

Input: nums = [2,5,6,0,0,1,2], target = 0
Output: true

Input: nums = [2,5,6,0,0,1,2], target = 3
Output: false
*/
public class Lc81 {
    public static boolean search(int[] nums, int target) {
        for(int i:nums){
            if(i==target){
                return true;
            }
        }
        return false;
        
    }
    public static void main(String[] args) {
        int[] nums = {2,5,6,0,0,1,2};int target = 6;
        System.out.println(search(nums, target));
    }
}
