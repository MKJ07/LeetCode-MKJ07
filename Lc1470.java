/*Question : 1470. Shuffle the Array
link:-https://leetcode.com/problems/shuffle-the-array/description/

Input: nums = [2,5,1,3,4,7], n = 3
Output: [2,3,5,4,1,7] 
Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].

Input: nums = [1,2,3,4,4,3,2,1], n = 4
Output: [1,4,2,3,3,2,4,1].
 */
public class Lc1470 {
    public static void main(String[] args) {
       int[] nums = {2,5,1,3,4,7};
       int n = 3;
       int e=0;
       int b[]=new int[nums.length+1];
       for(int i=0;i<n;i++){
        b[e]=nums[i];
        e++;
        b[e]=nums[i+n];
        e++;
       }
       for(int i=0;i<nums.length;i++){
        System.out.print(b[i]);
       }
}
    }
