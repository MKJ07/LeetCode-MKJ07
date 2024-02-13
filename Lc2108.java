/*Question: 2108. Find First Palindromic String in the Array.
Link: https://leetcode.com/problems/find-first-palindromic-string-in-the-array/description/

Input: words = ["notapalindrome","racecar"]
Output: "racecar"
Explanation: The first and only string that is palindromic is "racecar".

Input: words = ["def","ghi"]
Output: ""
Explanation: There are no palindromic strings, so the empty string is returned.
*/
public class Lc2108 {
    static Boolean isPalin(String s){
        int n=s.length();
        int i=0;
        while(i<n){
            if(s.charAt(i)!=s.charAt(n-1)){
                return false;
            }
            i++;
            n--;
        }
        return true;
    }
    public String firstPalindrome(String[] words) {
        /*This approach has TC: O(m+n) {m for the isPalin function and n is for firstPalindrome} and SC: O(1) */
        for(int i=0;i<words.length;i++){
            if(isPalin(words[i]))   return words[i];
        }
        return "";
    }

    public static void main(String[] args) {
        String[] words = {"abc","car","ada","racecar","cool"};
        Lc2108 obj=new Lc2108();
        System.out.println(obj.firstPalindrome(words));
    }
}
