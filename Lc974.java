import java.util.*;
/*Question:-974. Subarray Sums Divisible by K
Link:-https://leetcode.com/problems/subarray-sums-divisible-by-k/description/
Input: nums = [4,5,0,-2,-3,1], k = 5
Output: 7
Explanation: There are 7 subarrays with a sum divisible by k = 5:
[4, 5, 0, -2, -3, 1], [5], [5, 0], [5, 0, -2, -3], [0], [0, -2, -3], [-2, -3]

Input: nums = [5], k = 9
Output: 0
*/
public class Lc974 {
    public int subarraysDivByK(int[] nums, int k) {
        int ans=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int sum=0,rem=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            rem=sum%k;
            if(rem<0){
                rem+=k;
            }
            if(map.containsKey(rem)){
                ans+=map.get(rem);
                map.put(rem,map.get(rem)+1);
            }
            else{
                map.put(rem,1);
            }
        }
        return ans;
        
    }
    public static void main(String[] args) {
       int[] nums = {4,5,0,-2,-3,1};int k = 5;
       Lc974 t=new Lc974();
       System.out.println(t.subarraysDivByK(nums, k));
    }
}
