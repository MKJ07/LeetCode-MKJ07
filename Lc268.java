/*Question: 268. Missing Number.
Link: https://leetcode.com/problems/missing-number/description/

Example 1:
Input: nums = [3,0,1]
Output: 2
Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.

Example 2:
Input: nums = [0,1]
Output: 2
Explanation: n = 2 since there are 2 numbers, so all numbers are in the range [0,2]. 2 is the missing number in the range since it does not appear in nums.

Example 3:
Input: nums = [9,6,4,2,3,5,7,0,1]
Output: 8
Explanation: n = 9 since there are 9 numbers, so all numbers are in the range [0,9]. 8 is the missing number in the range since it does not appear in nums.
*/
public class Lc268 {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        /*
         * This is the sum of all natural number approach having TC: O(n) and SC: O(1)
         * int sum=n*(n+1)/2;
         * int arrSum=0;
         * for(int i:nums){
         * arrSum+=i;
         * }
         * return sum-arrSum;
         */

        /* This is another approach taking extra space having TC: O(2n) and SC: O(n) */
        int arr[] = new int[n + 1];
        for (int i = 0; i < n; i++) {
            arr[nums[i]] = 1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0)
                return i;
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] nums={9, 5, 7, 2, 4, 0, 8, 6, 3, 1};
        Lc268 obj=new Lc268();
        System.out.println(obj.missingNumber(nums));
    }
}
