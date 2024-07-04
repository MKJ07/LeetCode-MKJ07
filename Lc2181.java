/*Questiion: 2181. Merge Nodes in Between Zeros.
Link: https://leetcode.com/problems/merge-nodes-in-between-zeros/description/

Example 1:

Input: head = [0,3,1,0,4,5,2,0]
Output: [4,11]
Explanation: 
    The above figure represents the given linked list. The modified list contains
    - The sum of the nodes marked in green: 3 + 1 = 4.
    - The sum of the nodes marked in red: 4 + 5 + 2 = 11.

Example 2:

Input: head = [0,1,0,3,0,2,2,0]
Output: [1,3,4]
Explanation: 
    The above figure represents the given linked list. The modified list contains
    - The sum of the nodes marked in green: 1 = 1.
    - The sum of the nodes marked in red: 3 = 3.
    - The sum of the nodes marked in yellow: 2 + 2 = 4.
 */
public class Lc2181 {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; next = null; }
    }
    public static ListNode processList(ListNode head) {
        /*This approach has TC: O(n) and SC: O(n) {n: no of nodes in the list } */
        ListNode temp = head;
        ListNode res = null;
        ListNode t = null;

        while (temp != null) {
            if (temp.val == 0) {
                temp = temp.next;
                continue; 
            }

            int sum = 0;
            while (temp != null && temp.val != 0) {
                sum += temp.val;
                temp = temp.next;
            }

            if (sum != 0) {
                ListNode newNode = new ListNode(sum);
                if (res == null) {
                    res = newNode;
                    t = res;
                } else {
                    t.next = newNode;
                    t = t.next;
                }
            }
        }
        return res;
    }
    public static ListNode createLinkedList(int[] arr) {
        if (arr.length == 0) return null;
        ListNode head = new ListNode(arr[0]);
        ListNode current = head;
        for (int i = 1; i < arr.length; i++) {
            current.next = new ListNode(arr[i]);
            current = current.next;
        }
        return head;
    }
    public static void printLinkedList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        int[] input = {0, 1, 2, 0, 3, 4, 0};
        ListNode head = createLinkedList(input);
        ListNode result = processList(head);
        printLinkedList(result);
    }
}
