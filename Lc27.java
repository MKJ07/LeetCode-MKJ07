/*Question: 27. Remove Element.
Link: https://leetcode.com/problems/remove-element/

Input: nums = [3,2,2,3], val = 3
Output: 2, nums = [2,2,_,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 2.
It does not matter what you leave beyond the returned k (hence they are underscores).
*/
public class Lc27 {
    public int removeElement(int[] nums, int val) {
        int n=nums.length;int idx=0;
        int []res=new int[n];
        for(int i=0;i<n;i++){
            if(nums[i]!=val){
                res[idx]=nums[i];
                idx++;
            }
        }
        for(int i=0;i<n;i++){
            nums[i]=res[i];
        }
        return idx;
    }
    public static void main(String[] args) {
        int[] nums={0,1,2,2,3,0,4,2};
        Lc27 obj=new Lc27();
        System.out.println(obj.removeElement(nums, 2));
    }
}
