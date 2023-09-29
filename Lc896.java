/*Question: 896. Monotonic Array
Link: https://leetcode.com/problems/monotonic-array/description/ 

Example 1:

Input: nums = [1,2,2,3]
Output: true
Example 2:

Input: nums = [6,5,4,4]
Output: true
Example 3:

Input: nums = [1,3,2]
Output: false
*/
public class Lc896 {
    public boolean isMonotonic(int[] nums) {
        int asc = 0, desc = 0;
        int n = nums.length;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] <= nums[i + 1]) {
                asc++;
            }
            if (nums[i] >= nums[i + 1]) {
                desc++;
            }
        }
        if (asc == n - 1 || desc == n - 1) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Lc896 t = new Lc896();
        int[] nums = { 1, 2, 2, 3 };
        System.out.println(t.isMonotonic(nums));
    }
}
