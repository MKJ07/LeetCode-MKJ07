/*Question: 342. Power of Four.
Link: https://leetcode.com/problems/power-of-four/description/

Example 1:
Input: n = 16
Output: true

Example 2:
Input: n = 5
Output: false
*/
public class Lc342 {
    public boolean isPowerOfFour(int n) {
        if(n<1 || n==2147483647)
            return false;
        if(n==1) return true;
        int low=1,high=n;
        while(low<=high){
            int mid=(low+high)/2;
            int pow=(int)Math.pow(4,mid);
            
            if(pow==n){
                System.out.println(pow);
                return true;
            }
            else if(pow>n){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Lc342 obj=new Lc342();
        System.out.println(obj.isPowerOfFour(562154));
    }
}
