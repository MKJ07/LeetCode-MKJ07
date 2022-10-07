public class Lc1480 {
    public static void main(String[] args) {
        int a[]={1,2,3,4};
        int b[]=new int[a.length];
        int s=0;
        for(int i=0;i<a.length;i++){
            s+=a[i];
            b[i]=s;

            
        }
        for(int i=0;i<a.length;i++){

                System.out.println(b[i]);
            }
        


    }
}
