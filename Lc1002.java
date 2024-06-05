import java.util.ArrayList;
import java.util.List;

/*Question: 1002. Find Common Characters.
Link: https://leetcode.com/problems/find-common-characters/description/

Example 1:

Input: words = ["bella","label","roller"]
Output: ["e","l","l"]

Example 2:
Input: words = ["cool","lock","cook"]
Output: ["c","o"]
*/

public class Lc1002 {
    static void countChar(String words,int []cnt){
        int n=words.length();
        for(int i=0;i<n;i++){
            char ch=words.charAt(i);
            cnt[ch-'a']++;
        }
    }
    public List<String> commonChars(String[] words) {
        /*This approach has TC: O(T) and SC: O(T) {T: total no of character across the string int the array} */
        List<String> st=new ArrayList<>();
        int n=words.length;
        int []cnt=new int[26];
        countChar(words[0],cnt);
        for(int i=1;i<n;i++){
            int[] temp=new int[26];
            countChar(words[i],temp);
            for(int j=0;j<26;j++){
                cnt[j]=Math.min(cnt[j],temp[j]);
            }
        }
        for(int i=0;i<26;i++){
            int c=cnt[i];
            
            char ch=(char)(i+97);
            String s=""+ch;
            while(c>0){
                st.add(s);
                c--;
            }
        }
        return st;
    }
    public static void main(String[] args) {
        Lc1002 obj = new Lc1002();
        String[] words = {"bella", "label", "roller"};
        List<String> commonCharacters = obj.commonChars(words);
        System.out.println(commonCharacters);
    }
}
