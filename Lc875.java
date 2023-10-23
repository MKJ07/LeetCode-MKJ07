public class Lc875 {
    static int totalhour(int []piles,int hour){
        int n=piles.length;
        int thour=0;
        for(int i=0;i<n;i++){
            thour+=Math.ceil((double)piles[i]/(double)hour);
        }
        return thour;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int max=Integer.MIN_VALUE;
        for(int i:piles){
            if(i>max){
                max=i;
            }
        }
        int low=1,high=max;
        while(low<=high){
            int mid=(low+high)/2;
            int n=totalhour(piles,mid);
            if(n<=h){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
    public static void main(String[] args) {
        int[] v = {3, 6, 7, 11};
        int h = 8;
        Lc875 obj=new Lc875();
        int minRate = obj.minEatingSpeed(v, h);
        System.out.println("Minimum rate to eat bananas: " + minRate);
    }
}
