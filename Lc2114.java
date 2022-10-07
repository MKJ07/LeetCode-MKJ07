public class Lc2114 {
    public static void main(String[] args) {
        String a[]={"please wait", "continue to fight", "continue to win"};
        int h=0;
        String s1="";
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length();j++){
                s1=a[i];
                int c=0;
                for(int k=0;k<s1.length();k++){
                    if(s1.charAt(k) == ' '){
                        c++;
                    }
                }
                if(h<c){
                    h=c;                }            
            }
        }
        System.out.println(h+1);
        
    }
}
