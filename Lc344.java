/*Question: 344. Reverse String.
Link:-https://leetcode.com/problems/reverse-string/

Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]

Input: s = ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"] 
*/
public class Lc344 {
    public void reverseString(char[] s) {
        /*This is the optimal solution having TC: O(n) and SC: O(1) {n: length of the array (using two pointer approach) } */
        int high=s.length-1;
        int low=0;
        while(low<high){
            char temp=s[low];
            s[low]=s[high];
            s[high]=temp;
            high--;low++;
        }

        /*This is the brute force approach having TC: O(n) and SC: O(n) {n: length of the array } 
        char[] c=new char[s.length];
        int t=0;
        for(int i=s.length-1;i>=0;i--){
            c[t]=s[i];
            t++;
        }
        for(int i=0;i<c.length;i++){
            s[i]=c[i];
        }
        return s;*/
    }
    public static void main(String[] args) {
        char[] s={'h','e','l','l','o'};
        Lc344 obj=new Lc344();
        obj.reverseString(s);
        for (char c : s) {
            System.out.print(c+" ");
        }
    }
}
