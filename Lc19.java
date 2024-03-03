/*Question: 19. Remove Nth Node From End of List.
Link: https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/

Example 1:
Input: head = [1,2,3,4,5], n = 2
Output: [1,2,3,5]

Example 2:
Input: head = [1], n = 1
Output: []

Example 3:
Input: head = [1,2], n = 1
Output: [1]
*/
class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
    }
}
public class Lc19 {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        int n = 2;
        ListNode newHead = removeNthFromEnd(head, n);
        while (newHead != null) {
            System.out.print(newHead.val + " ");
            newHead = newHead.next;
        }
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        /*This approach has TC: O(n) and SC: O(1) {n: no of nodes} */
        ListNode temp = head;
        int cnt = 0;
        while (temp != null) {
            cnt++;
            temp = temp.next;
        }

        if (cnt == 1 && n == 1) {
            head = null;
            return head;
        }

        cnt -= n;
        if (cnt == 0) {
            head = head.next;
            return head;
        }

        ListNode t = head;
        while (cnt > 1) {
            t = t.next;
            cnt--;
        }

        ListNode res = null;
        if (t.next != null) {
            res = t.next;
            res = res.next;
            t.next = res;
        }
        return head;
    }
}
