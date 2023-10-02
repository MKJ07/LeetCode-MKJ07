/*Question: 81. Search in Rotated Sorted Array II
Link: https://leetcode.com/problems/search-in-rotated-sorted-array-ii/description/

Input: nums = [2,5,6,0,0,1,2], target = 0
Output: true

Input: nums = [2,5,6,0,0,1,2], target = 3
Output: false
*/
public class Lc81 {
    public static boolean search(int[] nums, int target) {
        /*This is the optimal approach having TC:O(logN) for the best and average case. O(N/2) for the worst case
         and SC:O(1) */
        int low = 0, high = nums.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (nums[mid] == target) {
                return true;
            }

            if (nums[low] == nums[mid] && nums[mid] == nums[high]) {
                low++;
                high--;
            } else if (nums[low] <= nums[mid]) {
                if (nums[low] <= target && target <= nums[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (nums[mid] <= target && target <= nums[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return false;

        /*
         * This is the brute force approach having TC:O(n) and SC:O(1)
         * for(int i:nums){
         * if(i==target){
         * return true;
         * }
         * }
         * return false;
         */

    }

    public static void main(String[] args) {
        int[] nums = { 2, 5, 6, 0, 0, 1, 2 };
        int target = 6;
        System.out.println(search(nums, target));
    }
}
