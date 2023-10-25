/*Question: 1295. Find Numbers with Even Number of Digits.
Link: https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

Input: nums = [12,345,2,6,7896]
Output: 2
Explanation: 
12 contains 2 digits (even number of digits). 
345 contains 3 digits (odd number of digits). 
2 contains 1 digit (odd number of digits). 
6 contains 1 digit (odd number of digits). 
7896 contains 4 digits (even number of digits). 
Therefore only 12 and 7896 contain an even number of digits.
*/
public class Lc1295 {
    public int findNumbers(int[] nums) {
        int evencount=0;
        for(int i=0;i<nums.length;i++){
            int n=nums[i];int count=0;
            while(n>0){
                n/=10;
                count++;
            }
            if(count%2==0){
                evencount++;
            }
        }
        return evencount;
        
    }
    public static void main(String[] args) {
        Lc1295 obj=new Lc1295();
        int[] nums={555,901,482,1771};
        System.out.println(obj.findNumbers(nums));
    }
}
