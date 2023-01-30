/*Question: 1137. N-th Tribonacci Number.
Link:-https://leetcode.com/problems/n-th-tribonacci-number/description/
Input: n = 4
Output: 4
Input: n = 25
Output: 1389537
 */
public class Lc1137 {
    public int tribonacci(int n) {
        if(n<=0)
            return 0;
        if(n==1 || n==2)
            return 1;
        int tri[]=new int[n+1];
        tri[0]=0;
        tri[1]=1;
        tri[2]=1;
        for(int i=3;i<=n;i++){
            tri[i]=tri[i-1]+tri[i-2]+tri[i-3];
        }
        return tri[n];
        
    }
    public static void main(String[] args) {
        int n=4;
        Lc1137 t=new Lc1137();
        System.out.println(t.tribonacci(n));
    }
}
