import java.util.*;
/*Question: 557. Reverse Words in a String III
Link: https://leetcode.com/problems/reverse-words-in-a-string-iii/description/

Input: s = "God Ding"
Output: "doG gniD"
*/
public class Lc557 {
    public String reverseWords(String s) {
        String[] arr=s.split(" ");
        String res="";
        
        for(int i=0;i<arr.length;i++){
            StringBuilder s1=new StringBuilder();
            s1.append(arr[i]);
            s1.reverse();
            if(i<arr.length-1){
                res+=s1+" ";
            } 
            else{
                res+=s1;
            }           
        }
        return res;
    }
    public static void main(String[] args) {
        Lc557 t=new Lc557();
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(t.reverseWords(s));
        sc.close();
    }
}
