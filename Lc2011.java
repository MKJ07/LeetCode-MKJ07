/**
 * Lc2011
 */
public class Lc2011 {

    public static void main(String[] args) {
        String[] s={"--x","x++","x++"};
        int x=0;
        for(int i=0;i<s.length;i++){
            if(s[i].charAt(1)== '+'){
                x++;
            }
            else{
                x--;
            }
        }
        System.out.println(x);
        // int a[]=new int[s.length];
        // int x=0;
        // for(int i=0;i<a.length;i++){
        //     a[i]=Integer.valueOf(s[i]);

        // }
        // for(int i=0;i<a.length;i++){

        //     System.out.println(a[i]);
        // }
        // x+=(int)s[0];
        // x+=(Integer.parseInt(s[0]));
        // System.out.println(Integer.parseInt(s[0]));
        // System.out.println(x);
    }
}