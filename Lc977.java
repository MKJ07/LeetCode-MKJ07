import java.util.*;
/*Code link:-https://leetcode.com/problems/squares-of-a-sorted-array/
Input: nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Input: nums = [-7,-3,2,3,11]
Output: [4,9,9,49,121] */
public class Lc977 {
    public int[] sortedSquares(int[] nums) {
        int[] arr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=nums[i]*nums[i];
        }
        Arrays.sort(arr);
        return arr;
        
    }
    public static void main(String[] args) {
        int[] nums={-4,-1,0,3,10};
        Lc977 o=new Lc977();
        int[] a=o.sortedSquares(nums);
        for(int i=0;i<nums.length;i++){
            System.out.println(a[i]);

        }
    }
}
