import java.util.Arrays;
/*Question: 2037. Minimum Number of Moves to Seat Everyone.
Link: https://leetcode.com/problems/minimum-number-of-moves-to-seat-everyone/description/

Example 1:
Input: seats = [3,1,5], students = [2,7,4]
Output: 4
Explanation: 
    The students are moved as follows:
    - The first student is moved from from position 2 to position 1 using 1 move.
    - The second student is moved from from position 7 to position 5 using 2 moves.
    - The third student is moved from from position 4 to position 3 using 1 move.
    In total, 1 + 2 + 1 = 4 moves were used.


Example 2:
Input: seats = [4,1,5,9], students = [1,3,2,6]
Output: 7
Explanation: 
    The students are moved as follows:
    - The first student is not moved.
    - The second student is moved from from position 3 to position 4 using 1 move.
    - The third student is moved from from position 2 to position 5 using 3 moves.
    - The fourth student is moved from from position 6 to position 9 using 3 moves.
    In total, 0 + 1 + 3 + 3 = 7 moves were used.


Example 3:
Input: seats = [2,2,6,6], students = [1,3,2,6]
Output: 4
Explanation: 
    Note that there are two seats at position 2 and two seats at position 6.
    The students are moved as follows:
    - The first student is moved from from position 1 to position 2 using 1 move.
    - The second student is moved from from position 3 to position 6 using 3 moves.
    - The third student is not moved.
    - The fourth student is not moved.
    In total, 1 + 3 + 0 + 0 = 4 moves were used.
 */
public class Lc2037 {
    public int minMovesToSeat(int[] seats, int[] students) {
        /*This approach has TC: O(nlogn) and SC: O(n) {n: no of elements in the array } */
        Arrays.sort(seats);
        Arrays.sort(students);
        int sum=0;
        for(int i=0;i<seats.length;i++){
            sum+=Math.abs(seats[i]-students[i]);
        }
        return sum;
    }
    public static void main(String[] args) {
        Lc2037 obj=new Lc2037();
        // Test Case 1
        int[] seats1 = {3, 1, 5};
        int[] students1 = {2, 7, 4};
        System.out.println(obj.minMovesToSeat(seats1, students1)); // Expected Output: 4

        // Test Case 2
        int[] seats2 = {4, 1, 3};
        int[] students2 = {2, 1, 3};
        System.out.println(obj.minMovesToSeat(seats2, students2)); // Expected Output: 2

        // Test Case 3
        int[] seats3 = {5, 10, 15};
        int[] students3 = {1, 11, 8};
        System.out.println(obj.minMovesToSeat(seats3, students3)); // Expected Output: 12

        // Test Case 4
        int[] seats4 = {2, 4, 6};
        int[] students4 = {2, 4, 6};
        System.out.println(obj.minMovesToSeat(seats4, students4)); // Expected Output: 0

        // Test Case 5
        int[] seats5 = new int[100];
        int[] students5 = new int[100];
        for (int i = 0; i < 100; i++) {
            seats5[i] = i + 1;
            students5[i] = 100 - i;
        }
        System.out.println(obj.minMovesToSeat(seats5, students5)); // Expected Output: 5000
    }
}
