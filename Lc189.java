/*Question: 189. Rotate Array
Link: https://leetcode.com/problems/rotate-array/description/

Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
*/
public class Lc189 {
    static void rot(int []nums,int start,int end){
        // int last=k;
        while (start < end) {
            int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
        start++;
        end--;
    }
    }
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        /*This method uses a new array stores the result array and then copy it into the original array */
        // int[] arr=new int[n];
        // for(int i=0;i<n;i++){
        //     arr[(i+k)%n]=nums[i];
        // }
        // for(int i=0;i<n;i++){
        //     nums[i]=arr[i];
        // }

        /*This is another methor of rotating the array by k */
        k = k % n; // Handle cases where k is greater than the array length
        rot(nums, 0, n - 1);
        rot(nums, 0, k - 1);
        rot(nums, k, n - 1);

    }
    public static void main(String[] args) {
        Lc189 t=new Lc189();
        int[] nums={1,2,3,4,5,6,7,8,9,10};
        t.rotate(nums, 3);
        for (int i : nums) {
            System.out.print(i+" ");
        }

    }
}
