import java.util.*;
/*Input: s = "abbaca"
Output: "ca"
Input: s = "azxxzy"
Output: "ay"*/
public class Lc1047 {
    public static void main(String[] args) {
        String S="azxxzy";
        Stack<Character> st=new Stack<>();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<S.length();i++){
            if(st.isEmpty()){
                st.push(S.charAt(i));
            }
            else if(st.peek()==S.charAt(i)){
                st.pop();
            }
            else if(st.peek()!=S.charAt(i)){
                st.push(S.charAt(i));
            } 
        }
        while(!st.isEmpty()){
            sb.append(st.peek());
            st.pop();
        }
        sb.reverse();
        String s1=sb.toString();
        System.out.println(s1);

    }   
}
