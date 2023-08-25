import java.util.HashMap;
/*Question: 560. Subarray Sum Equals K.
Link: https://leetcode.com/problems/subarray-sum-equals-k/description/

Example 1:

Input: nums = [1,1,1], k = 2
Output: 2
Example 2:

Input: nums = [1,2,3], k = 3
Output: 2
*/
public class Lc560 {
    public int subarraySum(int[] arr, int s) {
        int sum=0,count=0;
        HashMap<Integer,Integer> h1=new HashMap<>();
        h1.put(0, 1);
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            int diff=sum-s;
            if(h1.containsKey(diff)){
                count+=h1.get(diff);
                
            }
            h1.put(sum, h1.getOrDefault(sum, 0) + 1);

        }
        return count;
        
    }
    public static void main(String[] args) {
        int[] arr={1,4,2,6,-5,8,9,4,6};
        int k=2;
        Lc560 t=new Lc560();
        System.out.println(t.subarraySum(arr, k));

    }
}
