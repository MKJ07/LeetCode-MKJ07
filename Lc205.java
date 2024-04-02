import java.util.HashMap;
/*Question: 205. Isomorphic Strings.
Link: https://leetcode.com/problems/isomorphic-strings/description/

Example 1:
Input: s = "egg", t = "add"
Output: true

Example 2:
Input: s = "foo", t = "bar"
Output: false

Example 3:
Input: s = "paper", t = "title"
Output: true
*/
public class Lc205 {
    public boolean isIsomorphic(String s, String t) {
        /*This approach has TC: O(n^2) {worst case} and SC: O(n) {n: length of the string} */
        int n1=s.length();
        HashMap<Character,Character> h1=new HashMap<>();
        for(int i=0;i<n1;i++){
            char c1=s.charAt(i),c2=t.charAt(i);
            if(h1.containsKey(c1) && h1.get(c1)!=c2)
                return false;
            else if(h1.containsValue(c2)){
                for(char ch:h1.keySet()){
                    if(c2==h1.get(ch))
                        if(ch!=c1)
                            return false;
                }
            }
            else{
                h1.put(c1,c2);
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str1 = "egg";
        String str2 = "add";
        Lc205 obj=new Lc205();
        System.out.println(obj.isIsomorphic(str1, str2));
        String str3 = "foo";
        String str4 = "bar";
        System.out.println(obj.isIsomorphic(str3, str4));
    }
}
