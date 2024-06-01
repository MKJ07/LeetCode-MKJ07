/*Question: 3110. Score of a String.
Link: https://leetcode.com/problems/score-of-a-string/description/

Example 1:

Input: s = "hello"
Output: 13

Explanation:
    The ASCII values of the characters in s are: 'h' = 104, 'e' = 101, 'l' = 108, 'o' = 111. 
    So, the score of s would be |104 - 101| + |101 - 108| + |108 - 108| + |108 - 111| = 3 + 7 + 0 + 3 = 13.

Example 2:

Input: s = "zaz"
Output: 50

Explanation:
    The ASCII values of the characters in s are: 'z' = 122, 'a' = 97. 
    So, the score of s would be |122 - 97| + |97 - 122| = 25 + 25 = 50.
*/
public class Lc3110 {
    public int scoreOfString(String s) {
        /*This approach has TC: O(n) and SC: O(1) {n: length of the string }*/
        int sum=0;
        int n=s.length();
        for(int i=1;i<n;i++){
            int n1=(int)s.charAt(i-1);
            int n2=(int)s.charAt(i);
            sum+=Math.abs(n1-n2);
        }
        return sum;
    }
    public static void main(String[] args) {
        String s="hfjedskhf";
        Lc3110 obj=new Lc3110();
        System.out.println(obj.scoreOfString(s));
    }
}
