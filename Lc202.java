import java.util.*;
/*Code Link:-https://leetcode.com/problems/happy-number/description/
Input: n = 19
Output: true
Explanation:
12 + 92 = 82
82 + 22 = 68
62 + 82 = 100
12 + 02 + 02 = 1
Input: n = 2
Output: false
 */
public class Lc202 {
    public static int number(int num){
        int s=0;
        while(num>0){
            int d=num%10;
            s=s+(d*d);
            num/=10;  
        }
        return s;
    }
    public boolean isHappy(int n) {
        Set<Integer> hash_Set = new HashSet<Integer>();
        while(n>4){
            int num=number(n);
            if(hash_Set.contains(num))
                return false;
            hash_Set.add(num);
            n=num;
            
        }
        if(n==1)
            return true;
        else
            return false;
    }
    /*Another approach for this problem */
    // public boolean isHappy(int n) {
    //     while(n>4){
    //         int s=0,num=n;
    //         while(num>0){
    //             int d=num%10;
    //             s=s+(d*d);
    //             num/=10;
    //         }
    //         n=s;
    //     }
    //     if(n==1)
    //         return true;
    //     else
    //         return false;
        
    // }
    public static void main(String[] args) {
        int n=7;
        Lc202 t=new Lc202();
        System.out.println(t.isHappy(n));
    }
}
