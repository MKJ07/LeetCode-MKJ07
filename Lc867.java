/*Question: 867. Transpose Matrix.
Link: https://leetcode.com/problems/transpose-matrix/description/

Example 1:
Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [[1,4,7],[2,5,8],[3,6,9]]

Example 2:
Input: matrix = [[1,2,3],[4,5,6]]
Output: [[1,4],[2,5],[3,6]]
*/
public class Lc867 {
    public int[][] transpose(int[][] matrix) {
        /*This approach has TC: O(m*n) and SC: O(n*m) */
        int n=matrix.length;
        int m=matrix[0].length;
        int [][]trans=new int[m][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                trans[j][i]=matrix[i][j];
                // int temp=matrix[i][j];
                // matrix[i][j]=matrix[j][i];  it will give arrayindexoutofbound
                // matrix[j][i]=temp;
            }
        }
        return trans;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        Lc867 obj=new Lc867();
        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] transpose = obj.transpose(matrix);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }
    }
}
