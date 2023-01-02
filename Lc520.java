/*Code Link:-https://leetcode.com/problems/detect-capital/description/
Input: word = "USA"
Output: true
Input: word = "FlaG"
Output: false
Input: word = "FFFFFFFFFFFFFf"
Output: false
 */
public class Lc520 {
    static boolean dc(String s){
        int c=0,c1=0,c3=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='A' && s.charAt(i)<='Z')
                c++;
            else if(s.charAt(0)>='A' && s.charAt(0)<='Z'){
                if(s.charAt(i)>='a' && s.charAt(i)<='z')
                    c1++;
            }
            else if(s.charAt(i)>='a' && s.charAt(i)<='z'){
                c3++;
            }
        }
        if((c==s.length()) || (c1==(s.length()-1)) || c3==s.length())
            return true;
        return false;
    }
    public boolean detectCapitalUse(String word) {
        boolean res=dc(word);
        if(res== true)
            return true;
        else
            return false;        
    }
    public static void main(String[] args) {
        String s="Leetcode";
        Lc520 t=new Lc520();
        System.out.println(t.detectCapitalUse(s));
    }
}
