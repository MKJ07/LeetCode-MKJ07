import java.util.Arrays;
/*Question: 1051. Height Checker.
Link: https://leetcode.com/problems/height-checker/description/

Input: heights = [5,1,2,3,4]
Output: 5
Explanation:
heights:  [5,1,2,3,4]
expected: [1,2,3,4,5]
All indices do not match.
*/
public class Lc1051 {
    public int heightChecker(int[] heights) {
        int count=0;
        int n=heights.length;
        int[] nums=new int[n];
        System.arraycopy(heights, 0, nums , 0, n);
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            if(heights[i]!=nums[i]){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] heights={1,1,4,2,1,3};
        Lc1051 obj=new Lc1051();
        System.out.println(obj.heightChecker(heights));
    }
}
