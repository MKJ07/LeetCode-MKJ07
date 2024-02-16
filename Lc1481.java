import java.util.*;
/*Question: 1481. Least Number of Unique Integers after K Removals 
Link: https://leetcode.com/problems/least-number-of-unique-integers-after-k-removals/description/

Example 1:
Input: arr = [5,5,4], k = 1
Output: 1
Explanation: Remove the single 4, only 5 is left.

Example 2:
Input: arr = [4,3,1,1,3,3,2], k = 3
Output: 2
Explanation: Remove 4, 2 and either one of the two 1s or three 3s. 1 and 3 will be left.
*/
public class Lc1481 {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        /*This approach has TC: O(nlogn) and SC: O(n) */
        HashMap<Integer,Integer> h1=new HashMap<>();
        int n=arr.length;
        for(int i=0;i<n;i++){
            int ele=arr[i];
            if(h1.containsKey(ele)){
                h1.put(ele,h1.get(ele)+1);
            }
            else{
                h1.put(ele,1);
            }
        }
        ArrayList<Integer> al=new ArrayList<>();
        for(Map.Entry<Integer,Integer> mp:h1.entrySet()){
            al.add(mp.getValue());
        }
        Collections.sort(al);
        int val=0;
        int size=al.size();
        for(int i=0;i<size;i++){
            val+=al.get(i);
            if(val>k){
                return size-i;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] arr = {4, 3, 1, 1, 3, 3, 2};
        int k = 3;
        Lc1481 obj=new Lc1481();
        int result = obj.findLeastNumOfUniqueInts(arr, k);
        System.out.println("Minimum number of unique integers to remove: " + result);
    }
}
