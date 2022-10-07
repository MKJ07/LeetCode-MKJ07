/*  Input 1: strs = ["flower","flow","flight"]
    Output: "fl" 
    Input 2: strs = ["dog","racecar","car"]
    Output: "" */
public class Lc14 {
    public static int min(String[] s,int n){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(s[i].length() <min){
                min=s[i].length();
            }
        }
        return min;
    }
    public String longestCommonPrefix(String[] strs) {
        int n=strs.length;
        int minl=min(strs,n);
        String res="";
        for(int i=0;i<minl;i++){
            char c=strs[0].charAt(i);
            for(int j=1;j<n;j++){
                if(strs[j].charAt(i) != c){
                    return res;
                }
            }
            res+=c;
            
        }
        return res;
        
    }
    public static void main(String[] args) {
        String[] s={"flower","flow","flight"};
        Lc14 t=new Lc14();
        System.out.println(t.longestCommonPrefix(s));

    }
    
}
