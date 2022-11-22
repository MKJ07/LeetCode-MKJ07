/* code link:-https://leetcode.com/problems/move-zeroes/
Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
Input: nums = [0]
Output: [0] */
public class Lc283 {
    public int[] moveZeroes(int[] nums) {
        int[] arr=new int[nums.length];
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                arr[c]=nums[i];
                c++;
            }
        }
        for(int i=0;i<arr.length;i++){
            nums[i]=arr[i];
        }
        return nums;
        
    }
    public static void main(String[] args) {
        int[] a={0,1,0,3,12};
        Lc283 l=new Lc283();
        int[] ar=l.moveZeroes(a);
        for(int i=0;i<ar.length;i++){
            System.out.println(ar[i]);
        }

    }
}
