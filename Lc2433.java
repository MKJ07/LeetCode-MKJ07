/*Question: 2433. Find The Original Array of Prefix Xor
Link: https://leetcode.com/problems/find-the-original-array-of-prefix-xor/description/

Input: pref = [5,2,0,3,1]
Output: [5,7,2,3,2]
Explanation: From the array [5,7,2,3,2] we have the following:
- pref[0] = 5.
- pref[1] = 5 ^ 7 = 2.
- pref[2] = 5 ^ 7 ^ 2 = 0.
- pref[3] = 5 ^ 7 ^ 2 ^ 3 = 3.
- pref[4] = 5 ^ 7 ^ 2 ^ 3 ^ 2 = 1.
*/
public class Lc2433 {
    static int xorCal(int n, int[] pref) {
        int idx = 0;
        int xor = 0;
        while (idx <= n) {
            xor = xor ^ pref[idx];
            idx++;
        }
        return xor;
    }

    public int[] findArray(int[] pref) {
        /* This is the optimal approach having TC: O(N) and SC: O(N) */
        int n = pref.length;
        int[] res = new int[n];
        res[0] = pref[0];
        for (int i = 1; i < n; i++) {
            res[i] = pref[i - 1] ^ pref[i];
        }
        return res;
        /*
         * This is the brute force approach having TC: O(N^2) and SC: O(1)
         * int n=pref.length;
         * 
         * for(int i=1;i<pref.length;i++){
         * pref[i]=xorCal(i,pref);
         * }
         * return pref;
         */

    }
    public static void main(String[] args) {
        // Create an instance of your class (assuming it's named appropriately).
        Lc2433 calculator = new Lc2433();
    
        // Define the input array (pref) that you want to process.
        int[] pref = {5, 2, 0, 3, 1};
    
        // Call the findArray method to calculate the XOR prefix array.
        int[] result = calculator.findArray(pref);
    
        // Print the result to the console.
        System.out.print("Result: ");
        for (int value : result) {
            System.out.print(value + " ");
        }
    }
    
}
