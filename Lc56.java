import java.util.*;
/*Question: 56. Merge Intervals.
Link: https://leetcode.com/problems/merge-intervals/description/

Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
Output: [[1,6],[8,10],[15,18]]
Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6].
*/
public class Lc56 {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;
        Arrays.sort(intervals, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });

        List<int[]> resultList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (resultList.isEmpty() || intervals[i][0] > resultList.get(resultList.size() - 1)[1]) {
                resultList.add(new int[] { intervals[i][0], intervals[i][1] });
            } else {
                resultList.get(resultList.size() - 1)[1] = Math.max(resultList.get(resultList.size() - 1)[1],
                        intervals[i][1]);
            }
        }

        int[][] resultArray = new int[resultList.size()][2];
        for (int i = 0; i < resultList.size(); i++) {
            resultArray[i] = resultList.get(i);
        }

        return resultArray;

    }

    public static void main(String[] args) {
        int[][] intervals = {
                { 3777, 6912 },
                { 4524, 4754 },
                { 1493, 1645 },
                { 5553, 6035 },
                { 2246, 4357 },
                { 2363, 5720 },
                { 7854, 9897 },
                { 3976, 4658 },
                { 4181, 8779 },
                { 3917, 9256 }
        };
        Lc56 t = new Lc56();
        int[][] mat = t.merge(intervals);
        for (int[] is : mat) {
            System.out.println(is[0] + " " + is[1]);
        }

    }
}
