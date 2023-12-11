import java.util.HashMap;
import java.util.Map;
/*Question: 1287. Element Appearing More Than 25% In Sorted Array.
Link: https://leetcode.com/problems/element-appearing-more-than-25-in-sorted-array/description/

Example 1:
Input: arr = [1,2,2,6,6,6,6,7,10]
Output: 6

Example 2:
Input: arr = [1,1]
Output: 1
*/
public class Lc1287 {
    public int findSpecialInteger(int[] arr) {
        /*This approach has TC: O(2N) and SC: O(N) */
        HashMap<Integer,Integer> h1=new HashMap<>();
        for(int i:arr){
            if(h1.containsKey(i)){
                h1.put(i,h1.get(i)+1);
            }
            else{
                h1.put(i,1);
            }
        } 
        int ele=Integer.MIN_VALUE;
        int per=(int)Math.ceil(arr.length/4);
        for(Map.Entry<Integer,Integer> map:h1.entrySet()){
            if(map.getValue()>per){
                if(map.getKey()>=ele){
                    ele=map.getKey();
                }
            }
        }
        return ele;
    }

    public static void main(String[] args) {
        int[] arr={1,2,2,6,6,6,6,7,10,12,10,10,10,10};
        Lc1287 obj=new Lc1287();
        System.out.println(obj.findSpecialInteger(arr));
    }
}
