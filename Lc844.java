import java.util.Stack;

public class Lc844 {
    static String calc(String s){
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(!st.isEmpty() && s.charAt(i)=='#'){
                st.pop();
            }
            if(s.charAt(i)!='#'){
                st.push(s.charAt(i));
            }
        }
        String res="";
        for(int i=st.size()-1;i>=0;i--){
            res+=st.peek();
            st.pop();
        }
        return res;
    }
    

    public boolean backspaceCompare(String s, String t) {
        String s1=calc(s);
        String s2=calc(t);
        System.out.println(s1+" "+s2);
        if(s1.equals(s2)){
            return true;
        }
        return false;
        
    }
    public static void main(String[] args) {
        String s="y#fo##f",t="y#f#o##f";
        Lc844 obj=new Lc844();
        System.out.println(obj.backspaceCompare(s,t));
    }
}
