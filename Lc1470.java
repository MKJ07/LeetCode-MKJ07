public class Lc1470 {
    public static void main(String[] args) {
       int[] nums = {2,5,1,3,4,7};
       int n = 3;
       int e=0;
       int b[]=new int[nums.length+1];
       for(int i=0;i<n;i++){
        b[e]=nums[i];
        e++;
        b[e]=nums[i+n];
        e++;
       }
       for(int i=0;i<nums.length;i++){
        System.out.print(b[i]);
       }
}
    }
