import java.util.*;
public class Lc20 {
    public boolean isValid(String s) {
        Stack<Character> s1 = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                s1.push(s.charAt(i));

            }
            if (s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']') {
                if (s1.empty()) {
                    return false;
                } else {
                    if ((s1.peek().equals('(') && s.charAt(i) == ')') || (s1.peek().equals('{') && s.charAt(i) == '}')
                            || (s1.peek().equals('[') && s.charAt(i) == ']')) {
                        s1.pop();
                    } else {
                        return false;
                    }

                }
            }
            
        }
        if (s1.empty()) {
                return true;
            } else {
                return false;
            }
    }
    public static void main(String[] args) {
        Lc20 t=new Lc20();
        String s1="(({[]}))";
        System.out.println(t.isValid(s1));
        
    }
}