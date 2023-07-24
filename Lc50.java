/*Question : 50. Pow(x, n)
Link:https://leetcode.com/problems/powx-n/description/

Input: x = 2.00000, n = 10
Output: 1024.00000
Input: x = 2.10000, n = 3
Output: 9.26100
Input: x = 2.00000, n = -2
Output: 0.25000
Explanation: 2-2 = 1/22 = 1/4 = 0.25.
*/
public class Lc50 {
    public double myPow(double x, int n) {
        double d=Math.pow(x,n);
        System.out.print("%.5f"+d);
        return d;
    }
    public static void main(String[] args) {
        Lc50 t=new Lc50();
        System.out.println(t.myPow(2.100,3));
    }
}
