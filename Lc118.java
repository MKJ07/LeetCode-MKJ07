import java.util.*;
/*Question: 118. Pascal's Triangle.
Link: https://leetcode.com/problems/pascals-triangle/description/

Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
*/

public class Lc118 {
    static List<Integer> NCR(int n){//This function is used to add the columns in each row of the list. 
        List<Integer> al=new ArrayList<>();
        al.add(1);
        int ans=1;
        for(int i=1;i<n;i++){
            ans=ans*(n-i);
            ans/=i;
            al.add(ans);
        }
        return al;
    }
    public List<List<Integer>> generate(int numRows) {
        List <List<Integer>> arr=new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            arr.add(NCR(i));
        }
        return arr;
    }
    public static void main(String[] args) {
        Lc118 t=new Lc118();
        System.out.println(t.generate(6));
    }
}
