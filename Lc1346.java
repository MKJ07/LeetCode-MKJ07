import java.util.HashMap;
/*Question: 1346. Check If N and Its Double Exist.
Link: https://leetcode.com/problems/check-if-n-and-its-double-exist/

Input: arr = [10,2,5,3]
Output: true
Explanation: For i = 0 and j = 2, arr[i] == 10 == 2 * 5 == 2 * arr[j]
*/
public class Lc1346 {
    public boolean checkIfExist(int[] nums) {
        HashMap<Integer,Integer> h1=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int m=nums[i]*2;
            int d=(int)Math.ceil(nums[i]/2);
            if(h1.containsKey(m) || (nums[i]%2==0 && h1.containsKey(d))){
                return true;
            }
            else{
                h1.put(nums[i],1);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int []arr={3,1,7,11};
        Lc1346 obj=new Lc1346();
        System.out.println(obj.checkIfExist(arr));
    }
}
