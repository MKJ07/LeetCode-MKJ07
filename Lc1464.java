import java.util.*;
/*Code Link:-https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/description/
Input: nums = [3,4,5,2]
Output: 12 
Explanation: If you choose the indices i=1 and j=2 (indexed from 0), you will get the maximum value,
that is, (nums[1]-1)*(nums[2]-1) = (4-1)*(5-1) = 3*4 = 12.
Input: nums = [1,5,4,5]
Output: 16
Input: nums = [3,7]
Output: 12
*/
public class Lc1464 {
    public int maxProduct(int[] nums) {
        PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();
        for(int i=0;i<nums.length;i++){
            pQueue.add(nums[i]);
        }
        int max=0;
        int[] arr=new int[pQueue.size()];
        for(int i=arr.length-1;i>=0;i--){
            arr[i]=pQueue.peek();
            pQueue.remove();
        }
        max=(arr[0]-1)*(arr[1]-1);
        return max;

    }
    public static void main(String[] args) {
        int[] nums={3,4,5,2};
        Lc1464 t=new Lc1464();
        System.out.println(t.maxProduct(nums));

    }
}
