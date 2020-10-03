/**
 * @author Micgogi
 * on 10/3/2020  12:19 PM
 * Rahul Gogyani
 */
public class LC25 {
    static ListNode head;

    static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }

    public static void main(String args[]) {
        head = new ListNode(65);
        head.next = new ListNode(78);
        head.next.next = new ListNode(75);
        head.next.next.next = new ListNode(73);
        head.next.next.next.next = new ListNode(84);
        head.next.next.next.next.next = new ListNode(65);
        ListNode temp = reverseKGroup(head, 2);
        printLinkedlist(temp);

    }

    public static ListNode reverseKGroup(ListNode head, int k) {
        ListNode curr = head;
        int count = 0;
        while (curr != null && count != k) {
            curr = curr.next;
            count++;
        }
        if (count == k) {
            curr = reverseKGroup(curr, k);
            while (count-- > 0) {
                ListNode temp = head.next;
                head.next = curr;
                curr = head;
                head = temp;
            }
            head = curr;
        }
        return head;
    }
    public static void printLinkedlist(ListNode temp){
        while (temp != null){
            System.out.println(temp.val);
            temp = temp.next;
        }
    }

}

