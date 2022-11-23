/*code link:- https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
Input: nums = [8,1,2,2,3]
Output: [4,0,1,1,3]
Input: nums = [6,5,4,8]
Output: [2,1,0,3]
Input: nums = [7,7,7,7]
Output: [0,0,0,0]*/
public class Lc1365 {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] n=new int[102];
        for(int i:nums){
            n[i]++;
        }
        for(int i=1;i<n.length;i++){
            n[i]+=n[i-1];
        }
        int[] arr=new int[nums.length];
        for(int i=0;i<arr.length;i++){
            if(nums[i]==0){
                arr[i]=0;
            }
            else{
                arr[i]=n[nums[i]-1];
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] nums={8,1,2,2,3};
        Lc1365 l=new Lc1365();
        int[] a=l.smallerNumbersThanCurrent(nums);
        for(int i:a){
            System.out.println(i);
        }
    }
}
