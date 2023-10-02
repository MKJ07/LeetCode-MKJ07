/*Question: 153. Find Minimum in Rotated Sorted Array.
Link: https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/description/

Input: nums = [11,13,15,17]
Output: 11
Explanation: The original array was [11,13,15,17] and it was rotated 4 times. 
 */
public class Lc153 {
    public int findMin(int[] nums) {
        int low=0,high=nums.length-1;
        int ans=Integer.MAX_VALUE;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[low]<=nums[mid]){
                ans=Math.min(ans,nums[low]);
                low=mid+1;
            }
            else{
                high=mid-1;
                ans=Math.min(ans,nums[mid]);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Lc153 t=new Lc153();
        int[] nums={4,5,6,7,0,1,2};
        System.out.println(t.findMin(nums));
    }
}
