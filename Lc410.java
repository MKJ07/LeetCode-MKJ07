/*Question: 410. Split Array Largest Sum.
Link: https://leetcode.com/problems/split-array-largest-sum/description/

Example 1:

Input: nums = [7,2,5,10,8], k = 2
Output: 18
Explanation: There are four ways to split nums into two subarrays.
The best way is to split it into [7,2,5] and [10,8], where the largest sum among the two subarrays is only 18.
Example 2:

Input: nums = [1,2,3,4,5], k = 2
Output: 9
Explanation: There are four ways to split nums into two subarrays.
The best way is to split it into [1,2,3] and [4,5], where the largest sum among the two subarrays is only 9.
 */
public class Lc410 {
    static int student(int[] arr,int pages){
        int st=1,pages_St=0;
        for(int i=0;i<arr.length;i++){
            if(pages_St+arr[i]<=pages){
                pages_St+=arr[i];
            }
            else{
                st++;
                pages_St=arr[i];
            }
        }
        return st;
    }
    public static int findPages(int[] arr, int n, int m) {
        if(m>n){
            return -1;
        }
        int maxEle=-1,arrSum=0;
        for(int i=0;i<n;i++){
            if(arr[i]>maxEle)
                maxEle=arr[i];
            arrSum+=arr[i];
        }
        int low=maxEle,high=arrSum;
        while(low<=high){
            int mid=(low+high)/2;
            int num=student(arr,mid);
            if(num<=m){
               high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
    public int splitArray(int[] nums, int k) {
        /*This is the optimal approach having TC: O(nlogn) and SC: O(1) */
        return findPages(nums,nums.length,k);
    }
    public static void main(String[] args) {
        int[] array={7, 2, 5, 10, 8};
        int k = 2;
        Lc410 obj=new Lc410();
        int result = obj.splitArray(array, k);
        System.out.println("Minimum largest sum: " + result);
    }
}
