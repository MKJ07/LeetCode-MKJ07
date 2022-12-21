/*Code Link:-https://leetcode.com/problems/fibonacci-number/description/
Input: n = 2
Output: 1
Input: n = 3
Output: 2
 */
public class Lc509 {
    public int fib(int n) {
        if(n<=1)
            return n;
        return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args) {
        int n=2;
        Lc509 t=new Lc509();
        System.out.println(t.fib(n));
    }
}
