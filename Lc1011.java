/*Question: 1011. Capacity To Ship Packages Within D Days.
Link: https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/description/

Example 1:
Input: weights = [1,2,3,4,5,6,7,8,9,10], days = 5
Output: 15
Explanation: A ship capacity of 15 is the minimum to ship all the packages in 5 days like this:
1st day: 1, 2, 3, 4, 5
2nd day: 6, 7
3rd day: 8
4th day: 9
5th day: 10

Note that the cargo must be shipped in the order given, so using a ship of capacity 14 and splitting the packages into parts like (2, 3, 4, 5), (1, 6, 7), (8), (9), (10) is not allowed.

Example 2:
Input: weights = [3,2,2,4,1,4], days = 3
Output: 6
Explanation: A ship capacity of 6 is the minimum to ship all the packages in 3 days like this:
1st day: 3, 2
2nd day: 2, 4
3rd day: 1, 4
*/
public class Lc1011 {
    static int dayCalc(int[] weights, int cap) {
        int day = 0, load = 0;
        for (int i : weights) {
            if ((load + i) > cap) {
                day++;
                load = i;
            } else {
                load += i;
            }
        }
        return day;
    }

    public int shipWithinDays(int[] weights, int days) {
        /*
         * This approach have TC: O(NlogN) {N for each time dayCalc running and logN for
         * binary search} and SC: O(1)
         */
        int low = Integer.MIN_VALUE;
        int high = 0;
        for (int i : weights) {
            low = Math.max(low, i);
            high += i;
        }
        while (low <= high) {
            int mid = (low + high) / 2;
            int res = dayCalc(weights, mid);
            if (res < days) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int[] weights = { 250, 300, 350, 400, 450 };
        int day = 3;
        Lc1011 obj = new Lc1011();
        System.out.println(obj.shipWithinDays(weights, day));
    }
}
