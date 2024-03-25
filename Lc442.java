import java.util.ArrayList;
import java.util.List;

/*Question: 442. Find All Duplicates in an Array.
Link: https://leetcode.com/problems/find-all-duplicates-in-an-array/

Example 1:
Input: nums = [4,3,2,7,8,2,3,1]
Output: [2,3]

Example 2:
Input: nums = [1,1,2]
Output: [1]

Example 3:
Input: nums = [1]
Output: []
 */

public class Lc442 {
    public List<Integer> findDuplicates(int[] nums) {
        /*This approach has TC: O(n) and SC: O(n) {n: no of elements in array} */
        int n=nums.length;
        int[] arr=new int[n+1];

        for(int i=0;i<n;i++){
            arr[nums[i]]++;
        }
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]>1)
                l.add(i);
        }
        return l;
    }
    public static void main(String[] args) {
        Lc442 obj=new Lc442();
        int[] arr={1,2,4,1,2,5,7,8,9,5,8,6,4,5,8};
        System.out.println(obj.findDuplicates(arr));

    }
}
