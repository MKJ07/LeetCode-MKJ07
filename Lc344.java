/*code link:-https://leetcode.com/problems/reverse-string/
Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]
Input: s = ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"] */
public class Lc344 {
    public char[] reverseString(char[] s) {
        char[] c=new char[s.length];
        int t=0;
        for(int i=s.length-1;i>=0;i--){
            c[t]=s[i];
            t++;
        }
        for(int i=0;i<c.length;i++){
            s[i]=c[i];
        }
        return s;
    }
    public static void main(String[] args) {
        char[] s={'h','e','l','l','o'};
        Lc344 l=new Lc344();
        char[] s1=l.reverseString(s);
        for(int i=0;i<s1.length;i++){
            System.out.print(s1[i]);

        }



    }
}
