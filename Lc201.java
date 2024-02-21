/*201. Bitwise AND of Numbers Range.
Link: https://leetcode.com/problems/bitwise-and-of-numbers-range/description/

Example 1:
Input: left = 5, right = 7
Output: 4

Example 2:
Input: left = 0, right = 0
Output: 0

Example 3:
Input: left = 1, right = 2147483647
Output: 0
*/
public class Lc201 {
    public int rangeBitwiseAnd(int left, int right) {
        /*This approach having TC: O(log N) and SC: O(1) */
        int shift = 0;
        while (left < right) {
            left >>= 1;
            right >>= 1;
            shift++;
        }
        return left << shift;
    }
    public static void main(String[] args) {
        int left = 5;
        int right = 7;
        Lc201 obj=new Lc201();
        int result = obj.rangeBitwiseAnd(left, right);
        System.out.println("Bitwise AND of range [" + left + ", " + right + "] is: " + result);
    }
}
