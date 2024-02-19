/*Question: 231. Power of Two.
Link: https://leetcode.com/problems/power-of-two/description/

Example 1:
Input: n = 1
Output: true
Explanation: 20 = 1

Example 2:
Input: n = 16
Output: true
Explanation: 24 = 16

Example 3:
Input: n = 3
Output: false
*/
public class Lc231 {
    public boolean isPowerOfTwo(int n) {
        /* This is the optimal approach having TC: O(log n) and SC: O(1) */
        if (n == 2147483647) // this is the edge case so taken as individuals
            return false;
        int low = 0, high = n;
        while (low <= high) {
            int mid = (low + high) / 2;
            int temp = (int) Math.pow(2, mid);
            if (temp == n)
                return true;
            else if (temp > n) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }

        }
        return false;
        /*
         * This is the brute force approach having TC: O(n) and SC: O(1)
         * int i=0;
         * while(i<=n){
         * int temp=(int)Math.pow(2,i);
         * if(temp==n)
         * return true;
         * i++;
         * }
         * return false;
         */
    }
    public static void main(String[] args) {
        Lc231 obj =new Lc231();
        System.out.println(obj.isPowerOfTwo(5689));
    }
}
