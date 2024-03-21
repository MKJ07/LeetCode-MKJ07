// import java.util.ArrayList;
// import java.util.Collections; {when using extra space use this packages}

/*Question: 206. Reverse Linked List.
Link: https://leetcode.com/problems/reverse-linked-list/description/

Example 1:
Input: head = [1,2,3,4,5]
Output: [5,4,3,2,1]

Example 2:
Input: head = [1,2]
Output: [2,1]

Example 3:
Input: head = []
Output: []
*/

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class Lc206 {
    public ListNode reverseList(ListNode head) {
        /*This a better approach having TC: O(n) and SC: O(1) {n: no of elements in the linkedlist and without using extra space} */
        if(head==null){
            return head;
        }
        ListNode curr=head;
        ListNode temp;ListNode res=null;
        while(curr!=null){
            temp=curr.next;
            curr.next=res;
            res=curr;
            curr=temp;
        }
        head=res;
        return head;

        /*This is the brute force appraoch having TC: O(n) and SC: O(n) {n: no of elements in the linkedlist }
        if(head==null || head.next==null)
            return head;
        ArrayList<Integer> al=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            al.add(temp.val);
            temp=temp.next;
        }
        Collections.reverse(al);
        head.val=al.get(0);
        ListNode t=new ListNode(al.get(1));
        head.next=t;
        for(int i=2;i<al.size();i++){
            t.next=new ListNode(al.get(i));
            t=t.next;
        }
        return head; */
        
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode temp = head;
        for (int i = 2; i <= 5; i++) {
            temp.next = new ListNode(i);
            temp = temp.next;
        }
        Lc206 obj = new Lc206();
        ListNode reversedList = obj.reverseList(head);
        while (reversedList != null) {
            System.out.print(reversedList.val + " ");
            reversedList = reversedList.next;
        }
    }
}
