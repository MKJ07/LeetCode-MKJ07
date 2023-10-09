/*Question: 34. Find First and Last Position of Element in Sorted Array.
Link: https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/

Example 1:
Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]

Example 2:
Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]
 */
public class Lc34 {
    static int lowerbound(int[] nums,int target){
        int n=nums.length;
        int low=0,high=n-1;
        int idx=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]>=target){
                high=mid-1;
                if(nums[mid]==target)
                    idx=mid;
            }
            else{
                low=mid+1;
            }
        }
        return idx;
    }
    static int upperbound(int[] nums,int target){
        int n=nums.length;
        int low=0,high=n-1;
        int idx=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]<=target){
                low=mid+1;
                if(nums[mid]==target)
                    idx=mid;
            }
            else{
                high=mid-1;
                
            }
        }
        return idx;
    }
    public int[] searchRange(int[] nums, int target) {
        int[] arr={lowerbound(nums,target),upperbound(nums,target)};
        return arr;
    }
    public static void main(String[] args) {
        int[] nums={1,3,4,5,8,8,8,9};
        int target=8;
        Lc34 t=new Lc34();
        int[] res=t.searchRange(nums, target);
        System.out.println(res[0]+" "+res[1]);
    }
}
