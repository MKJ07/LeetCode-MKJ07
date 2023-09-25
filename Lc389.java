/*Question: 389. Find the Difference.
Link: https://leetcode.com/problems/find-the-difference/description/

Input: s = "", t = "y"
Output: "y"
 */
public class Lc389 {
    public char findTheDifference(String s, String t) {
        int sum1=0,sum2=0;
        for(char c:s.toCharArray()){
            sum1+=c;
        }
        for(char c:t.toCharArray()){
            sum2+=c;
        }
        return (char)(sum2-sum1);
    }
    public static void main(String[] args) {
        String s = "abcd", s1 = "abcde";
        Lc389 t=new Lc389();
        System.out.println(t.findTheDifference(s, s1));
    }
}
