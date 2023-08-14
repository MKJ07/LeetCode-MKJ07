/*Question: 485. Max Consecutive Ones
Link: https://leetcode.com/problems/max-consecutive-ones/description/

Input: nums = [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
*/
public class Lc485 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=Integer.MIN_VALUE;int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
            }
            else if(nums[i]==0){
                count=0;
            }
            if(count>max){
                max=count;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr={1,1,1,0,0,1,0,1,1,0};
        Lc485 t=new Lc485();
        System.out.println(t.findMaxConsecutiveOnes(arr));
    }
}
