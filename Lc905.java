/*Question: 905. Sort Array By Parity.
Link: https://leetcode.com/problems/sort-array-by-parity/description/ 

Input: nums = [3,1,2,4]
Output: [2,4,3,1]
Explanation: The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
*/
public class Lc905 {
    public int[] sortArrayByParity(int[] nums) {
        int n=nums.length;
        int[] res=new int[n];
        int l=0,r=n-1,i=0;
        while(l<=r){
            if(nums[i]%2==0){
                res[l]=nums[i];
                i++;l++;
            }
            else{
                res[r]=nums[i];
                r--;i++;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr={2,1,4,5,4,8,7,3,5,8};
        Lc905 t=new Lc905();
        arr=t.sortArrayByParity(arr);
        for (int i : arr) {
            System.out.print(i+" ");
        }

    }
    
}