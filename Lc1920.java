/*Question: 1920. Build Array from Permutation
Link: https://leetcode.com/problems/build-array-from-permutation/

Input: nums = [5,0,1,2,3,4]
Output: [4,5,0,1,2,3]
Explanation: The array ans is built as follows:
ans = [nums[nums[0]], nums[nums[1]], nums[nums[2]], nums[nums[3]], nums[nums[4]], nums[nums[5]]]
    = [nums[5], nums[0], nums[1], nums[2], nums[3], nums[4]]
    = [4,5,0,1,2,3]
*/
public class Lc1920 {

    public static void main(String[] args) {
        int a[]={1,2,4,3,0};
        int b[]=new int[a.length];
        for(int i=0;i<a.length;i++){
            b[i]=a[a[i]];
        }
        for(int i=0;i<b.length;i++){
            System.out.println(b[i]);
        }
    }
}