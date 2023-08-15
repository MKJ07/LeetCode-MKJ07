/*Question: 136. Single Number
Link: https://leetcode.com/problems/single-number/description/

Input: nums = [4,1,2,1,2]
Output: 4
*/
public class Lc136 {
    public int singleNumber(int[] nums) {
        int xor=0;
        for(int i:nums){
            xor^=i;
        }
        return xor;
    }
    public static void main(String[] args) {
        Lc136 t=new Lc136();
        int[] nums={4,1,2,1,2};
        System.out.println(t.singleNumber(nums));

    }
}
