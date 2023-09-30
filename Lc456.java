import java.util.Stack;

/*Question: 456. 132 Pattern.
Link: https://leetcode.com/problems/132-pattern/

Input: nums = [3,1,4,2]
Output: true
Explanation: There is a 132 pattern in the sequence: [1, 4, 2].
*/
public class Lc456 {
    public boolean find132pattern(int[] nums) {
        /*This is the optimal approach having TC:O(n) and SC:O(n) */
        int n = nums.length;
        Stack<Integer> st = new Stack<>();
        int ele = Integer.MIN_VALUE;
        for (int i = n - 1; i >= 0; i--) {
            if (nums[i] < ele) {
                return true;
            }
            while (!st.isEmpty() && st.peek() < nums[i]) {
                ele = st.peek();
                st.pop();
            }
            st.push(nums[i]);
        }
        return false;

        /*
         * This is the brute force approach having TC:O(n^3) and SC:O(1)
         * for(int i=0;i<n;i++){
         * for(int j=i+1;j<n;j++){
         * for(int k=j+1;k<n;k++){
         * if(nums[i]<nums[k] && nums[k]<nums[j]){
         * return true;
         * }
         * }
         * }
         * }
         * return false;
         */
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 4, 3, 6, 8, 7 };
        Lc456 t = new Lc456();
        System.out.println(t.find132pattern(nums));
    }
}
