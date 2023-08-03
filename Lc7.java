/*Question: 7. Reverse Integer
Link: https://leetcode.com/problems/reverse-integer/description/

Input: x = 123
Output: 321

Input: x = -123
Output: -321
 */
public class Lc7 {
    public static int reverse(int x) {
        int res=0;
        while(Math.abs(x)>0){
            int d=x%10;
            if((res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && d > 7))){
                return 0;
            }
            else if(res < Integer.MIN_VALUE / 10 || (res == Integer.MIN_VALUE / 10 && d < -8)){
                return 0;
            }
            res=res*10+d;
            x/=10;
        }
        if(x<0)
            return -res;
        return res;
    }
    public static void main(String[] args) {
        System.out.println(reverse(25648520));
    }
}
