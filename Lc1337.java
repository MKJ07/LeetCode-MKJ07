import java.util.Arrays;
/*Question: 1337. The K Weakest Rows in a Matrix.
Link: https://leetcode.com/problems/the-k-weakest-rows-in-a-matrix/

Input: mat = 
[[1,0,0,0],
 [1,1,1,1],
 [1,0,0,0],
 [1,0,0,0]], 
k = 2
Output: [0,2]
Explanation: 
The number of soldiers in each row is: 
- Row 0: 1 
- Row 1: 4 
- Row 2: 1 
- Row 3: 1 
The rows ordered from weakest to strongest are [0,2,3,1]. */
public class Lc1337 {
    public int[] kWeakestRows(int[][] mat, int k) {

        int n=mat.length;
        int m=mat[0].length;
        int[] ele=new int[k];
        int[] temp=new int[n];
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<m;j++){
                if(mat[i][j]==1){
                    count++;
                }
            }
            temp[i]=count*10+i;
        }
        Arrays.sort(temp);
        for(int i=0;i<k;i++){
            ele[i]=temp[i]%10;
        }
        return ele;

    }
    public static void main(String[] args) {
        Lc1337 t=new Lc1337();
        int[][] mat = {
            {1, 1, 1},
            {1, 1, 0},
            {1, 0, 0},
            {1, 1, 1},
            {0, 0, 0}
        };
        int[] result=t.kWeakestRows(mat, 3);
        for (int i : result) {
            System.out.print(i+" ");
        }     
    }
}
