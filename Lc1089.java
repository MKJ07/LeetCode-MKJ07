/*Question: 1089. Duplicate Zeros.
Link: https://leetcode.com/problems/duplicate-zeros/

Input: arr = [1,2,3]
Output: [1,2,3]
Explanation: After calling your function, the input array is modified to: [1,2,3]
*/
public class Lc1089 {
    public void duplicateZeros(int[] arr) {
        int count = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                count++;
            }
        }
        int newLength = n + count;
        int i = n - 1;
        int j = newLength - 1;
        
        while (i >= 0) {
            if (j < n) {
                arr[j] = arr[i];
            }
            j--;
            
            if (arr[i] == 0) {
                if (j < n) {
                    arr[j] = 0;
                }
                j--;
            }
            
            i--;
        }
    }
    

    public static void main(String[] args) {
        Lc1089 obj = new Lc1089();
        int[] arr = { 1, 0, 2, 3, 0, 4, 5, 0 };
        obj.duplicateZeros(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
