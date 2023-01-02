import java.util.*;
/*Code Link:-https://leetcode.com/problems/make-array-zero-by-subtracting-equal-amounts/description/

Input: nums = [1,5,0,3,5]
Output: 3
Explanation:
In the first operation, choose x = 1. Now, nums = [0,4,0,2,4].
In the second operation, choose x = 2. Now, nums = [0,2,0,0,2].
In the third operation, choose x = 2. Now, nums = [0,0,0,0,0].

Input: nums = [0]
Output: 0
 */
public class Lc2357 {
    static int min(int[] arr) {
        int minvalue = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0)
                continue;
            else {
                minvalue = Math.min(minvalue, arr[i]);
            }

        }
        return minvalue;

    }

    public int minimumOperations(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int count = 0;
        while ((nums[n - 1]) != 0) {
            int min = min(nums);
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 0) {
                    continue;
                } else {
                    nums[i] = nums[i] - min;
                }
            }
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 5, 0, 3, 5 };
        Lc2357 t = new Lc2357();
        System.out.println();
    }
}
