/*Code Link:-https://leetcode.com/problems/climbing-stairs/description/
Input: n = 2
Output: 2
Input: n = 3
Output: 3
*/
public class Lc71 {
    public int climbStairs(int n) {
        int c1=1;
        int c2=1;int sum=0;
        if(n==1)
            return 1;
       for(int i=0;i<n-1;i++){
           sum=c1+c2;
           int t=c1;
           c1=c2;
           c2=sum;
       } 
       return sum;
    }
    public static void main(String[] args) {
        int n=2;
        Lc71 t=new Lc71();
        System.out.println(t.climbStairs(n));

    }
}
