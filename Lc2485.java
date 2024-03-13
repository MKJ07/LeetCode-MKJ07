/*Question: 2485. Find the Pivot Integer.
Link: https://leetcode.com/problems/find-the-pivot-integer/description/

Example 1:
Input: n = 8
Output: 6
Explanation: 6 is the pivot integer since: 1 + 2 + 3 + 4 + 5 + 6 = 6 + 7 + 8 = 21.

Example 2:
Input: n = 1
Output: 1
Explanation: 1 is the pivot integer since: 1 = 1.
Example 3:

Input: n = 4
Output: -1
Explanation: It can be proved that no such integer exist.
*/
public class Lc2485 {
    public static int pivotInteger(int n) {
        if(n==1)
            return 1;
        /*This is the brute force approach having TC: O(n^2) and SC: O(1) 
        for(int i=1;i<=n;i++){
            int leftSum=0,rightSum=0;
            for(int j=1;j<=i;j++)   leftSum+=j;
            for(int k=i;k<=n;k++)   rightSum+=k;
            if(leftSum==rightSum)   return i;
        }
        return -1;
        */

        /*This is the optimal approach having TC: O(logN) and SC: O(1) */
        int left=2,right=n-1;
        int sum1=1,sum2=n;
        while(left<=right){
            if(sum1==sum2 && left==right){
                return left;
            }
            else if(sum1<sum2){
                sum1+=left;
                left++;               
            }
            else{
                sum2+=right;
                right--;         
            }
        }
        return -1;
    }
	public static void main(String[] args) {
        System.out.println(pivotInteger(8));
    }
}
