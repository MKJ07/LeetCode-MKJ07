import java.util.ArrayList;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class Lc2058 {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
            int[] res = new int[2];
            res[0] = -1;
            res[1] = -1;
            ArrayList<Integer> al = new ArrayList<>();
            int cnt = 1;
            int prev = head.val;
            ListNode temp = head.next;
            while (temp != null && temp.next != null) {
                if ((temp.val < prev && temp.val < temp.next.val) || 
                    (temp.val > prev && temp.val > temp.next.val)) {
                    al.add(cnt);
                }
                cnt++;
                prev = temp.val;
                temp = temp.next;
            }
            int n = al.size();
            if (n <= 1) return res;
            res[0] = al.get(1) - al.get(0);
            for (int i = 2; i < n; i++) {
                res[0] = Math.min(res[0], al.get(i) - al.get(i - 1));
            }
            res[1] = al.get(n - 1) - al.get(0);
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
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
    }

    public static void main(String[] args) {
        int[] input = {1, 3, 2, 2, 3, 2, 2, 2, 7};
        ListNode head = createLinkedList(input);
        Lc2058 obj= new Lc2058();
        int[] result = obj.nodesBetweenCriticalPoints(head);
        printArray(result);
    }
}
