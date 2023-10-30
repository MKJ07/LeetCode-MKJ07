import java.util.*;
/*Question: 1356. Sort Integers by The Number of 1 Bits.
Link: https://leetcode.com/problems/sort-integers-by-the-number-of-1-bits/description/

Input: arr = [0,1,2,3,4,5,6,7,8]
Output: [0,1,2,4,8,3,5,6,7]
Explantion: [0] is the only integer with 0 bits.
[1,2,4,8] all have 1 bit.
[3,5,6] have 2 bits.
[7] has 3 bits.
The sorted array by bits is [0,1,2,4,8,3,5,6,7].
*/
public class Lc1356 {
    public int[] sortByBits(int[] arr) {
        /* It is the optimal appraoch having TC: O(N * log(N)) and SC:O(N) */
        return Arrays.stream(arr).boxed()
                .sorted(Comparator.comparingInt(Integer::bitCount).thenComparingInt(Integer::valueOf))
                .mapToInt(Integer::intValue).toArray();
        /*
         * Here is the proper explanation of the code
         * return Arrays.stream(arr) // Step 1: Convert the array to a stream of
         * integers
         * .boxed() // Step 2: Box the integers into Integer objects
         * .sorted( // Step 3: Sort the stream
         * Comparator.comparingInt(Integer::bitCount) // Sort by bit count
         * .thenComparingInt(Integer::valueOf) // Then sort by integer value
         * )
         * .mapToInt(Integer::intValue) // Step 4: Map the sorted stream back to int
         * .toArray(); // Step 5: Convert the stream to an int array
         * 
         */
    }

    public static void main(String[] args) {
        int[] arr = { 1, 4, 2, 5, 9, 3, 5 };
        Lc1356 obj = new Lc1356();
        int[] res = obj.sortByBits(arr);
        for (int i : res) {
            System.out.print(i + " ");
        }
    }
}
