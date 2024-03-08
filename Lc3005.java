import java.util.*;
/*Question: 3005. Count Elements With Maximum Frequency.
Link: https://leetcode.com/problems/count-elements-with-maximum-frequency/description/

Example 1:
Input: nums = [1,2,2,3,1,4]
Output: 4
Explanation: The elements 1 and 2 have a frequency of 2 which is the maximum frequency in the array.
So the number of elements in the array with maximum frequency is 4.

Example 2:
Input: nums = [1,2,3,4,5]
Output: 5
Explanation: All elements of the array have a frequency of 1 which is the maximum.
So the number of elements in the array with maximum frequency is 5.
*/

public class Lc3005 {
    public int maxFrequencyElements(int[] nums) {
        /*This approach has TC: O(n+m) and SC: O(n) {n: no of elements in array, m: no of unique elements in hashmap} */
        int max=Integer.MIN_VALUE;
        HashMap<Integer,Integer> h1=new HashMap<>();
        for(int i:nums){
            if(h1.containsKey(i)){
                h1.put(i,h1.get(i)+1);
            }
            else{
                h1.put(i,1);
            }
            max=Math.max(max,h1.get(i));
        }
        int sum=0;
        for(Map.Entry<Integer,Integer> m:h1.entrySet()){
            if(m.getValue()==max){
                sum+=max;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] arr={1,2,4,1,4,1,5,5,6,8,7,1,5,6,2};
        Lc3005 obj=new Lc3005();
        System.out.println(obj.maxFrequencyElements(arr));
    }
}
