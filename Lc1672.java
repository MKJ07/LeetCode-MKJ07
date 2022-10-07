public class Lc1672 {
    public static void main(String[] args) {
        int a[][]={{1,5},{7,3},{3,5}};
        int h=0;
        for(int i=0;i<a.length;i++){
            int s=0;
            for(int j=0;j<a[i].length;j++){
                s+=a[i][j];               
            }
            if(h<s){
                h=s;
            }
        }
        System.out.println(h);
    }
}
