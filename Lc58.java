/*Question: 58. Length of Last Word.
Link: https://leetcode.com/problems/length-of-last-word/description/

Example 1:
Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.

Example 2:
Input: s = "   fly me   to   the moon  "
Output: 4
Explanation: The last word is "moon" with length 4.

Example 3:
Input: s = "luffy is still joyboy"
Output: 6
Explanation: The last word is "joyboy" with length 6.
*/

public class Lc58 {
    public int lengthOfLastWord(String s) {
        /*This approach has TC: O(n) {n: length of the string} and SC: O(m) {m: no of words in the array after splitting} */
        String[] s1=s.split(" ");
        int n=s1.length;
        return s1[n-1].length();
    }
    public static void main(String[] args) {
        String s="I love my Country India ";
        Lc58 obj=new Lc58();
        System.out.println(obj.lengthOfLastWord(s));
    }
}
