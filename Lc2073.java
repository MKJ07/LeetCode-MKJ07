/*Question: 2073. Time Needed to Buy Tickets.
Link: https://leetcode.com/problems/time-needed-to-buy-tickets/description/

Example 1:
Input: tickets = [2,3,2], k = 2
Output: 6
Explanation: 
- In the first pass, everyone in the line buys a ticket and the line becomes [1, 2, 1].
- In the second pass, everyone in the line buys a ticket and the line becomes [0, 1, 0].
The person at position 2 has successfully bought 2 tickets and it took 3 + 3 = 6 seconds.

Example 2:
Input: tickets = [5,1,1,1], k = 0
Output: 8
Explanation:
- In the first pass, everyone in the line buys a ticket and the line becomes [4, 0, 0, 0].
- In the next 4 passes, only the person in position 0 is buying tickets.
The person at position 0 has successfully bought 5 tickets and it took 4 + 1 + 1 + 1 + 1 = 8 seconds.
 */
public class Lc2073 {
    public static void main(String[] args) {
        int[] tickets = {4, 5, 6, 3};
        int k = 2;
        System.out.println(timeRequiredToBuy(tickets, k));
    }

    public static int timeRequiredToBuy(int[] tickets, int k) {
        /*This approach has TC: O(n) {n: length of the tickets} and SC: O(1) */
        int cnt = 0;
        int n = tickets.length;
        for (int i = 0; i < n; i++) {
            if (i <= k) {
                cnt += Math.min(tickets[i], tickets[k]);
            } else {
                cnt += Math.min(tickets[k] - 1, tickets[i]);
            }
        }
        return cnt;
    }
}
