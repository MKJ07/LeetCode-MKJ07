/*Question: 1283. Find the Smallest Divisor Given a Threshold.
Link: https://leetcode.com/problems/find-the-smallest-divisor-given-a-threshold/description/

Input: nums = [1,2,5,9], threshold = 6
Output: 5
Explanation: We can get a sum to 17 (1+2+5+9) if the divisor is 1. 
If the divisor is 4 we can get a sum of 7 (1+1+2+3) and if the divisor is 5 the sum will be 5 (1+1+1+2). 

Input: nums = [44,22,33,11,1], threshold = 5
Output: 44
*/

public class Lc1283 {
    static int checkNum(int arr[],int mid){
        int sum=0;
        for(int i:arr){
            sum+=Math.ceil((double)(i) / (double)(mid));;
        }
        return sum;

    }
    public int smallestDivisor(int[] arr, int limit) {
        int max=Integer.MIN_VALUE;
        for(int i:arr){
            max=Math.max(max,i);
        }
        int low=1,high=max;
        while(low<=high){
            int mid=(low+high)/2;
            int res=checkNum(arr,mid);
            if(res<=limit){
                high=mid-1;
            }
            else{
                low=mid+1;                
            }

        }
        return low;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int limit = 8;
        Lc1283 obj=new Lc1283();
        int ans = obj.smallestDivisor(arr, limit);
        System.out.println("The minimum divisor is: " + ans);
    }
}
