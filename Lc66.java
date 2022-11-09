public class Lc66 {
    public static void main(String[] args) {
        int digits[]={1,2,3};
        int sum=0;
        for(int i=0;i<digits.length;i++){
            sum=(sum*10)+digits[i];
        }
        sum+=1;
        String str = Integer.toString(sum);
        String[] st = str.split(",");
        int[] arr=new int[st.length];
        for(int i=0;i<arr.length;i++){
            // arr[i]= Integer.valueOf(st[i]);
            arr[i]=Integer.parseInt(st[i]);
            // System.out.println(arr[i]);
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr.length);
        }
    }
    
}
