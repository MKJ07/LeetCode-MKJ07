import java.util.Scanner;
/*Code link:-https://leetcode.com/contest/biweekly-contest-93/problems/maximum-value-of-a-string-in-an-array/
 * Input:-["alic3","bob","3","4","00000"]
   Output:-5
   Input:-["1","01","001","0001"]
   Output:-1
 */
public class Lc2496 {
    public int maximumValue(String[] strs) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<strs.length;i++){
           String s=strs[i];
            boolean a=true;
            for(int j=0;j<s.length();j++){
                if((s.charAt(j)>=97 && s.charAt(j)<=122)){
                    a=false;
                    max=Math.max(max,s.length());
                }
                
            }
            if(a==true){
                max=Math.max(max,Integer.parseInt(strs[i]));
            }
            
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String [] arr={"alic3","bob","3","4","00000"};
        Lc2496 t=new Lc2496();
        System.out.println(t.maximumValue(arr));
        sc.close();
    }
}
