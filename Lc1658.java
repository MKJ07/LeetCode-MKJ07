import java.util.HashMap;

/*Question: 1658. Minimum Operations to Reduce X to Zero.
Link: https://leetcode.com/problems/minimum-operations-to-reduce-x-to-zero/description/

Input: nums = [3,2,20,1,1,3], x = 10
Output: 5
Explanation: The optimal solution is to remove the last three elements and the first two elements (5 operations in total) to reduce x to zero.
 */
public class Lc1658 {
    public int minOperations(int[] nums, int x) {

        int l = 0;
        int sum = 0;
        int n = nums.length;
        HashMap<Integer, Integer> h1 = new HashMap<>();

        for (int i = 0; i < n; ++i) {
            sum += nums[i];
            h1.put(sum, i);
        }
        if (x > sum) {
            return -1;
        }
        sum -= x;
        int value = 0;

        h1.put(0, 0);
        for (int i = 0; i < nums.length; ++i) {
            value += nums[i];
            if (h1.containsKey(value - sum)) {
                if (value - sum == 0) {
                    l = Math.max(l, i - h1.get(value - sum) + 1);
                } else {
                    l = Math.max(l, i - h1.get(value - sum));
                }
            }
        }
        if (l == 0) {
            if (sum == 0)
                return nums.length;
            else
                return -1;
        } else {
            return nums.length - l;
        }

    }

    public static void main(String[] args) {
        Lc1658 t = new Lc1658();
        int[] nums = { 1, 1, 4, 2, 3 };
        System.out.println(t.minOperations(nums, 5));
    }
}
