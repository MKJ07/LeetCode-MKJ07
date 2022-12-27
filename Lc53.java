/*Code Link:-https://leetcode.com/problems/maximum-subarray/description/
Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.
Input: nums = [1]
Output: 1
Input: nums = [5,4,-1,7,8]
Output: 23
 */
public class Lc53 {
    public int maxSubArray(int[] nums) {
        int m=Integer.MIN_VALUE,c=0;
        int cnt=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                cnt++;
            }
            max=Math.max(max,nums[i]);
        }
        if(cnt==nums.length){
            return max;
        }
        for(int i=0;i<nums.length;i++){
            c+=nums[i];
            if(c<0){
                c=0;
            }
            if(c>m){
                m=c;
            }
        }
        if(m<0){
            int t=nums[0];
            return t;
        }else{
            return m;
            
        }
        
    }
    public static void main(String[] args) {
        int[] arr={-2,1,-3,4,-1,2,1,-5,4};
        Lc53 t=new Lc53();
        System.out.println(t.maxSubArray(arr));
    }
    
}
