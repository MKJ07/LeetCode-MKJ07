import java.util.ArrayList;
/*Question: 57. Insert Interval.
Link: https://leetcode.com/problems/insert-interval/description/

Example 1:
Input: intervals = [[1,3],[6,9]], newInterval = [2,5]
Output: [[1,5],[6,9]]

Example 2:
Input: intervals = [[1,2],[3,5],[6,7],[8,10],[12,16]], newInterval = [4,8]
Output: [[1,2],[3,10],[12,16]]
Explanation: Because the new interval [4,8] overlaps with [3,5],[6,7],[8,10].
*/

public class Lc57 {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        /*This is the optimal approach having TC: O(n) and SC: O(n) {n: no of rows, columns is 2 only so neglect it} */
        ArrayList<ArrayList<Integer>> a1=new ArrayList<>();
        int n=intervals.length;
        int i=0;
        while(i<n){
            if(intervals[i][1]<newInterval[0]){
                ArrayList<Integer> temp=new ArrayList<>();
                temp.add(intervals[i][0]);
                temp.add(intervals[i][1]);
                a1.add(temp);
            }
            else if(intervals[i][0]>newInterval[1]){
                break;
            }
            else{
                newInterval[0]=Math.min(intervals[i][0],newInterval[0]);
                newInterval[1]=Math.max(intervals[i][1],newInterval[1]);
            }
            i++;
        }
        ArrayList<Integer> t=new ArrayList<>();
        t.add(newInterval[0]);
        t.add(newInterval[1]);
        a1.add(t);
        while(i<n){
            ArrayList<Integer> temp=new ArrayList<>();
            temp.add(intervals[i][0]);
            temp.add(intervals[i][1]);
            a1.add(temp);
            i++;
        }

        int[][] twoDArray = new int[a1.size()][];
        for (int k=0;k<a1.size();k++) {
            ArrayList<Integer> row = a1.get(k);
            twoDArray[k] = new int[row.size()];
            for (int j = 0; j < row.size(); j++) {
                twoDArray[k][j] = row.get(j);
            }
        }
        return twoDArray;

    }
    public static void main(String[] args) {
        Lc57 obj=new Lc57();
        int[][] intervals = {{1, 3}, {6, 9},{10,11}};
        int[] newInterval = {2, 5};
        int[][] result = obj.insert(intervals, newInterval);
        for (int i = 0; i < result.length; i++) {
            System.out.println("["+result[i][0] + "," + result[i][1]+"]");
        }
    }
}
