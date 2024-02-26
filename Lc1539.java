/*Question: 1539. Kth Missing Positive Number.
Link: https://leetcode.com/problems/kth-missing-positive-number/description/

Example 1:
Input: arr = [2,3,4,7,11], k = 5
Output: 9
Explanation: The missing positive integers are [1,5,6,8,9,10,12,13,...]. The 5th missing positive integer is 9.

Example 2:
Input: arr = [1,2,3,4], k = 2
Output: 6
Explanation: The missing positive integers are [5,6,7,...]. The 2nd missing positive integer is 6.
*/
public class Lc1539 {
    public int findKthPositive(int[] arr, int k) {
        /*This approach has TC: O(logN) and SC: O(1) */
        int n=arr.length;
        int low=0,high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            int miss=arr[mid]-(mid+1);
            if(miss<k){
                low=mid+1;
            }
            else{
                high=mid-1;
            }

        }
        return high+1+k;
    }
    public static void main(String[] args) {
        Lc1539 obj=new Lc1539();
        int[] arr={2,3,4,7,11};
        int k=2;
        System.out.println(obj.findKthPositive(arr, k));
    }
}
