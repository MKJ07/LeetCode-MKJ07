/*Question: 258. Add Digits
Link:-https://leetcode.com/problems/add-digits/description/

Input: num = 38
Output: 2
Explanation: The process is
38 --> 3 + 8 --> 11
11 --> 1 + 1 --> 2 
Since 2 has only one digit, return it.

Input: num = 0
Output: 0
 */
public class Lc258 {
    static int res(int n){
        int s=0;
        while(n!=0){
            int d=n%10;
            s+=d;
            n/=10;
        }
        return s;
    }
    public int addDigits(int num) {
        int sum=res(num);
        while((sum/10)!=0){
            sum=res(sum); 
        }
        return sum;
        
    }
    public static void main(String[] args) {
        Lc258 t=new Lc258();
        System.out.println(t.addDigits(852));
    }
}
