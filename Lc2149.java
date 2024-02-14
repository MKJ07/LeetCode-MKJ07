/*Question: 2149. Rearrange Array Elements by Sign.
Link: https://leetcode.com/problems/rearrange-array-elements-by-sign/description/

Input: nums = [3,1,-2,-5,2,-4]
Output: [3,-2,1,-5,2,-4]
Explanation:
The positive integers in nums are [3,1,2]. The negative integers are [-2,-5,-4].
The only possible way to rearrange them such that they satisfy all conditions is [3,-2,1,-5,2,-4].
Other ways such as [1,-2,2,-5,3,-4], [3,1,2,-2,-5,-4], [-2,3,-5,1,-4,2] are incorrect because they do not satisfy one or more conditions.  
 */
public class Lc2149 {
    public int[] rearrangeArray(int[] nums) {
        /*This approach has TC; O(n) and SC: O(1) {where n is the size of the array} */
        int posIdx=0,negIdx=1;
        int[] result=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                result[posIdx]=nums[i];
                posIdx+=2;
            }
            else{
                result[negIdx]=nums[i];
                negIdx+=2;
            }
        }
        return result;
        
    }
    public static void main(String[] args) {
        int[] arr={1, -1, 2, -2, 3, -3, 4, -4, 5, -5, 6, -6, 7, -7, 8, -8, 9, -9, 10, -10};
        Lc2149 t=new Lc2149();
        int[] res=t.rearrangeArray(arr);
        for (int i : res) {
            System.out.print(i+" ");
        }

    }

}
