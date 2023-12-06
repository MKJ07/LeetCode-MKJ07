/*Question: 1716. Calculate Money in Leetcode Bank.
Link: https://leetcode.com/problems/calculate-money-in-leetcode-bank/description/ 

Input: n = 10
Output: 37
Explanation: After the 10th day, the total is (1 + 2 + 3 + 4 + 5 + 6 + 7) + (2 + 3 + 4) = 37. Notice that on the 2nd Monday, Hercy only puts in $2.

Input: n = 20
Output: 96
Explanation: After the 20th day, the total is (1 + 2 + 3 + 4 + 5 + 6 + 7) + (2 + 3 + 4 + 5 + 6 + 7 + 8) + (3 + 4 + 5 + 6 + 7 + 8) = 96.
*/
public class Lc1716 {
    public int totalMoney(int n) {
        int ans=0;
        for(int i=0;i<n;i++){
          ans+=(i/7)+1+(i%7);
        }
        return ans;
    }

    public static void main(String[] args) {
        Lc1716 obj=new Lc1716();
        System.out.println(obj.totalMoney(36));
    }
}
