/*Question:- 2529. Maximum Count of Positive Integer and Negative Integer.
 *Link:- https://leetcode.com/contest/weekly-contest-327/problems/maximum-count-of-positive-integer-and-negative-integer/
Input: nums = [-2,-1,-1,1,2,3]
Output: 3
Explanation: There are 3 positive integers and 3 negative integers. The maximum count among them is 3.

Input: nums = [5,20,66,1314]
Output: 4
Explanation: There are 4 positive integers and 0 negative integers. The maximum count among them is 4.
*/
public class Lc2529 {
    public int maximumCount(int[] nums) {
        int max=Integer.MIN_VALUE;
        int pos=0,neg=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0)
                    neg++;
            else if(nums[i]>0)
                    pos++;
        }
        max=Math.max(pos,neg);
        return max;
    }
    public static void main(String[] args) {
        int[] arr={-3,-2,-1,0,0,1,2};
        Lc2529 t=new Lc2529();
        System.out.println(t.maximumCount(arr));

    }
    
}
