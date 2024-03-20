/*Question: 1669. Merge In Between Linked Lists.
Link: https://leetcode.com/problems/merge-in-between-linked-lists/description/

Example 1:
Input: list1 = [10,1,13,6,9,5], a = 3, b = 4, list2 = [1000000,1000001,1000002]
Output: [10,1,13,1000000,1000001,1000002,5]
Explanation: We remove the nodes 3 and 4 and put the entire list2 in their place. The blue edges and nodes in the above figure indicate the result.

Example 2:
Input: list1 = [0,1,2,3,4,5,6], a = 2, b = 5, list2 = [1000000,1000001,1000002,1000003,1000004]
Output: [0,1,1000000,1000001,1000002,1000003,1000004,6]
Explanation: The blue edges and nodes in the above figure indicate the result.
*/

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}
public class Lc1669 {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        /*This approach has TC: O(n + m) and SC: O(1) {n: no of nodes in list1, m: no of nodes in list2 } */
        ListNode temp = list1;
        int cnt = 0;
        ListNode st = temp;
        ListNode st1 = list2;
        boolean isRun = true;

        while (isRun) {
            if (cnt == a) {
                while (cnt < b) { // Changed condition to cnt < b
                    temp = temp.next;
                    cnt++;
                }
                isRun = false;
            } else {
                st = temp;
                temp = temp.next;
                cnt++;
            }
        }

        while (st1.next != null) {
            st1 = st1.next;
        }

        st.next = list2;
        st1.next = temp;

        return list1;
    }

    public static void main(String[] args) {
        ListNode list1 = new ListNode(0);
        ListNode temp = list1;
        for (int i = 1; i <= 5; i++) {
            temp.next = new ListNode(i);
            temp = temp.next;
        }
        ListNode list2 = new ListNode(100);
        temp = list2;
        for (int i = 101; i <= 102; i++) {
            temp.next = new ListNode(i);
            temp = temp.next;
        }

        // Call mergeInBetween
        Lc1669 obj = new Lc1669();
        ListNode mergedList = obj.mergeInBetween(list1, 2, 4, list2);
        System.out.println("Merged List:");
        while (mergedList != null) {
            System.out.print(mergedList.val + " ");
            mergedList = mergedList.next;
        }
    }
}
