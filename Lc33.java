/*Question: 33. Search in Rotated Sorted Array
Link: https://leetcode.com/problems/search-in-rotated-sorted-array/description/

Input: nums = [4,5,6,7,0,1,2], target = 0
Output: 4

Input: nums = [4,5,6,7,0,1,2], target = 3
Output: -1
*/
public class Lc33 {
    public int search(int[] nums, int target) {
        int low=0,high=nums.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                return mid;
            }
            if(nums[low]<=nums[mid]){
                if(nums[low]<=target && target<=nums[mid]){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            else{
                if(nums[mid]<=target && target<=nums[high]){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums={7,8,9,1,2,3,4,5,6};
        Lc33 t=new Lc33();
        System.out.println(t.search(nums, 1));
    }
}
