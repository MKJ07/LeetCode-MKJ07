/*Question: 21. Merge Two Sorted Lists.
Link: https://leetcode.com/problems/merge-two-sorted-lists/description/

Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]

Input: list1 = [], list2 = [0]
Output: [0]
*/
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) {
        this.val = val;
    }
}
public class Lc21 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null && list2!=null) return list2;
        if(list2==null && list1!=null) return list1;
        ListNode t=new ListNode();
        ListNode res=t;
        
        while(list1!=null && list2!=null){
            if(list1.val>list2.val){
                ListNode temp=new ListNode(list2.val);
                if(res==null){
                    res=temp;
                }
                else{
                    res.next=temp;
                    res=res.next;
                }
                list2=list2.next;
            }
            else{
                ListNode temp=new ListNode(list1.val);
                if(res==null){
                    res=temp;
                }
                else{
                    res.next=temp;
                    res=res.next;
                }
                list1=list1.next;
            }
        }
        while(list1!=null){
            ListNode temp=new ListNode(list1.val);
            res.next=temp;
            res=res.next;
            list1=list1.next;
        }
        while(list2!=null){
            ListNode temp=new ListNode(list2.val);
            res.next=temp;
            res=res.next;
            list2=list2.next;
        }
        return t.next; 
    }
    public static void main(String[] args) {
        Lc21 obj=new Lc21();
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);

        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);
        ListNode mergedList = obj.mergeTwoLists(list1, list2);
        printList(mergedList);
    }
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }
}
