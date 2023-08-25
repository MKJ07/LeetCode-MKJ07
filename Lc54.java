import java.util.ArrayList;
import java.util.List;
/*Question: 54. Spiral Matrix.
Link: https://leetcode.com/problems/spiral-matrix/description/

Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [1,2,3,6,9,8,7,4,5]
*/
public class Lc54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        List<Integer> list = new ArrayList<>();
        int top = 0, left = 0, bottom = n - 1, right = m - 1;
        while (left <= right && top <= bottom) {
            for (int i = left; i <= right; i++) {
                list.add(matrix[top][i]);
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                list.add(matrix[i][right]);
            }
            right--;
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    list.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    list.add(matrix[i][left]);
                }
                left++;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int arr[][] = {
                { 1, 3, 7 },
                { 10, 12, 15 },
                { 19, 20, 21 }
        };
        Lc54 t = new Lc54();
        System.out.println(t.spiralOrder(arr));
    }
}
