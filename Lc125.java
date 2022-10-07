public class Lc125 {
    public boolean isPalindrome(String s) {
        String s1="";
        for(int i=0;i<s.length();i++){
            if((s.charAt(i)>='a' && s.charAt(i)<='z') || (s.charAt(i)>='A' && s.charAt(i)<='Z') || (s.charAt(i)>='0' && s.charAt(i)<='9')){
                s1+=s.charAt(i);
            }
        }
        s1=s1.toLowerCase();
        int b=0;
        int l=s1.length()-1;
        while(b<=l){
            if(s1.charAt(b)!=s1.charAt(l)){
                return false;
                
            }
            else{
                b++;
                l--;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s="A man, a plan, a canal: Panama";
        Lc125 t=new Lc125();
        System.out.println(t.isPalindrome(s));
    }
}
