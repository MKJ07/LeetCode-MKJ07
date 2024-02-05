import java.util.HashMap;
/*Question: 387. First Unique Character in a String.
Link: https://leetcode.com/problems/first-unique-character-in-a-string/description/

Input: s = "leetcode"
Output: 0

Input: s = "loveleetcode"
Output: 2

Input: s = "aabb"
Output: -1
*/
public class Lc387 {
    public int firstUniqChar(String s) {
        /*This code has TC: O(2n) and SC: O(n) */
        int n=s.length();
        HashMap<Character,Integer> h1=new HashMap<>();
        for(int i=0;i<n;i++){
            if(h1.containsKey(s.charAt(i))){
                h1.put(s.charAt(i),h1.get(s.charAt(i))+1);
            }
            else{
                h1.put(s.charAt(i),1);
            }
        }
        for(int i=0;i<n;i++){
            if(h1.get(s.charAt(i))==1)
                return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        String s="ilovemyindia";
        Lc387 obj=new Lc387();
        System.out.println(obj.firstUniqChar(s));
    }
}
