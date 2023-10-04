import java.util.*;
/*Question: 13. Roman to Integer.
Link: https://leetcode.com/problems/roman-to-integer/description/ 

Input: s = "LVIII"
Output: 58
Explanation: L = 50, V= 5, III = 3.
*/
public class Lc13 {
    public int romanToInt(String s) {
        HashMap<Character,Integer> h1=new HashMap<>();
        h1.put('I',1);
        h1.put('V',5);
        h1.put('X',10);
        h1.put('L',50);
        h1.put('C',100);
        h1.put('D',500);
        h1.put('M',1000);
        int res=h1.get(s.charAt(s.length()-1));
        for(int i=s.length()-2;i>=0;i--){
            if(h1.get(s.charAt(i))<h1.get(s.charAt(i+1))){
                res-=h1.get(s.charAt(i));
            }
            else{
                res+=h1.get(s.charAt(i));
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String s="MVCDI";
        Lc13 t=new Lc13();
        System.out.println(t.romanToInt(s));
    }
}
