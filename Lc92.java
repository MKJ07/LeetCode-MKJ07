/*Question: 92. Reverse Linked List II.
Link: https://leetcode.com/problems/reverse-linked-list-ii/description/

Input: head = [1,2,3,4,5], left = 2, right = 4
Output: [1,4,3,2,5]
*/

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class Lc92 {
    public static void main(String[] args) {
        // Create a sample linked list
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        // Define left and right values for reverseBetween
        int left = 2;
        int right = 4;

        // Call the reverseBetween function
        Lc92 main = new Lc92();
        ListNode result = main.reverseBetween(head, left, right);

        // Print the result (the modified linked list)
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }

    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dum = new ListNode();
        dum.next = head;
        ListNode leftNode = dum;
        ListNode currNode = head;
        for (int i = 0; i < left - 1; i++) {
            leftNode = leftNode.next;
            currNode = currNode.next;
        }
        ListNode startRev = currNode;
        ListNode prev = null;
        for (int i = 0; i < right - left + 1; i++) {
            ListNode temp = currNode.next;
            currNode.next = prev;
            prev = currNode;
            currNode = temp;
        }
        leftNode.next = prev;
        startRev.next = currNode;
        return dum.next;
    }
}
