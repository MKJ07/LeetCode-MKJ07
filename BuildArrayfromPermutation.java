/**
 * BuildArrayfromPermutation
 */
public class BuildArrayfromPermutation {

    public static void main(String[] args) {
        int a[]={1,2,4,3,0};
        int b[]=new int[a.length];
        for(int i=0;i<a.length;i++){
            b[i]=a[a[i]];
        }
        for(int i=0;i<b.length;i++){
            System.out.println(b[i]);
        }
    }
}