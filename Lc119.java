import java.util.*;
/*Question: 119. Pascal's Triangle II.
Link: https://leetcode.com/problems/pascals-triangle-ii/description/

Example 1:

Input: rowIndex = 3
Output: [1,3,3,1]
Example 2:

Input: rowIndex = 0
Output: [1]
Example 3:

Input: rowIndex = 1
Output: [1,1]
*/
public class Lc119 {
    static List<Integer> NCR(int n){
        List<Integer> al = new ArrayList<>();
        al.add(1);
        long ans = 1;
        for (int i = 1; i < n; i++) {
            ans = (ans * (n - i)) / i;
            al.add((int) ans);
        }
        return al;
    }
    public List<Integer> getRow(int rowIndex) {
      List<Integer> li=NCR(rowIndex+1);
      return li;
      
    }
    public static void main(String[] args) {
        Lc119 t=new Lc119();
        int rowIndex = 30;
        List<Integer> result = t.getRow(rowIndex);
        System.out.println(result);
    }
}
