/*Question: 338. Counting Bits.
Link: https://leetcode.com/problems/counting-bits/description/

Input: n = 5
Output: [0,1,1,2,1,2]
Explanation:
0 --> 0
1 --> 1
2 --> 10
3 --> 11
4 --> 100
5 --> 101
 */
public class Lc338 {
    static int binary(int num){
        int sum=0;
        while(num>0){
            int d=num%2;
            sum+=d;
            num/=2;
        }
        return sum;
    }
    public int[] countBits(int n) {
        int[] arr=new int[n+1];
        arr[0]=0;
        for(int i=1;i<=n;i++){
            arr[i]=binary(i);
        }
        return arr;
    }
    public static void main(String[] args) {
        int n=12;
        Lc338 t=new Lc338();
        int[] res=t.countBits(n);
        for (int i : res) {
            System.out.print(i+" ");
        }

    }
}
