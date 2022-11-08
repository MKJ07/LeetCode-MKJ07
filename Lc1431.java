import java.util.*;
class Lc1431 {
    static int largestElement(int[] arr) {
        int largest_element =Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest_element)
                largest_element=arr[i];
        }
        return largest_element;
    }
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3}; int extraCandies = 3;
        int max=largestElement(candies);
        Boolean[] b = new Boolean[candies.length];
        for(int i=0;i<candies.length;i++){
            if((candies[i]+extraCandies)>=max){
                b[i]=true;
            }
            else{
                b[i]=false;
            }
        }
        ArrayList<Boolean> a1=new ArrayList<>();
        for(int i=0;i<b.length;i++){
            a1.add(b[i]);
        }
        for(Boolean i:a1){
            System.out.print(i+" ");
            
        }  
    }
}