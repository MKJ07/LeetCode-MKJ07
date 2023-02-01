/*Question: 1071. Greatest Common Divisor of Strings
Link:-https://leetcode.com/problems/greatest-common-divisor-of-strings/description/

Input: str1 = "ABCABC", str2 = "ABC"
Output: "ABC"

Input: str1 = "ABABAB", str2 = "ABAB"
Output: "AB"

Input: str1 = "LEET", str2 = "CODE"
Output: ""
*/
public class Lc1071 {
    static int gcd(int a, int b)
    {
        int result = Math.min(a, b); // Find Minimum of a nd b
        while (result > 0) {
            if (a % result == 0 && b % result == 0) {
                break;
            }
            result--;
        }
        return result; // return gcd of a nd b
    }
    public String gcdOfStrings(String str1, String str2) {
        int n1=str1.length();
        int n2=str2.length();
        String s1=str1+str2;
        String s2=str2+str1;
        if(!s1.equals(s2)){
            return "";
        }
        return str1.substring(0,gcd(n1,n2));
        
    }
    public static void main(String[] args) {
        String str1 = "ABABAB", str2 = "ABAB";
        Lc1071 t=new Lc1071();
        System.out.println(t.gcdOfStrings(str1, str2));
    }
    
}
