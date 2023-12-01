/*Question: 1662. Check If Two String Arrays are Equivalent
Link: https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/description/

Input: word1 = ["ab", "c"], word2 = ["a", "bc"]
Output: true
Explanation:
word1 represents string "ab" + "c" -> "abc"
word2 represents string "a" + "bc" -> "abc"
The strings are the same, so return true.
 */
public class Lc1662 {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        /*This code has TC: O(m1​+m2​+n) and SC: O(1) */
        String w1="",w2="";
        for(String s:word1){
            w1+=s;
        }
        for(String s:word2){
            w2+=s;
        }
        if(w1.length()!=w2.length())
            return false;
        for(int i=0;i<w1.length();i++){
            if(w1.charAt(i)!=w2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String[] word1  = {"abc", "d", "defg","h","i"}; 
        String word2[] = {"abcddefg","hi"};
        Lc1662 t=new Lc1662();
        System.out.println(t.arrayStringsAreEqual(word1, word2));
    }
}
