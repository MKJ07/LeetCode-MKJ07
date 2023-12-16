/*Question: 242. Valid Anagram
Link: https://leetcode.com/problems/valid-anagram/description/

Example 1:
    Input: s = "anagram", t = "nagaram"
    Output: true
Example 2:
    Input: s = "rat", t = "car"
    Output: false
*/

import java.util.Arrays;

public class Lc242 {
    public boolean isAnagram(String s, String t) {
        /*This approach has TC: O(nlogn) and SC: O(n) */
        if(s.length()!=t.length()){
            return false;
        }
        s=s.toLowerCase();
        t=t.toLowerCase();
        char[] c=s.toCharArray();
        char[] c1=t.toCharArray();
        Arrays.sort(c);
        Arrays.sort(c1);
        int cnt=0;
        for(int i=0;i<c.length;i++){
            if(c[i]==c1[i]){
                cnt++;
            }
        }
        if(c.length==cnt){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        String s1 = "Listen";
        String s2 = "Silent";
        Lc242 obj =new Lc242();
        boolean result = obj.isAnagram(s1, s2);
        System.out.println(result);
    }

}
