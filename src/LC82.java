

/**
 * @author Micgogi
 * on 1/5/2021  2:11 PM
 * Rahul Gogyani
 */
public class LC82 {
    static ListNode root;
    static ListNode root1;

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            this.val = x;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        root = new ListNode(2);
        root.next = new ListNode(1);
        root.next.next = new ListNode(3);
        root.next.next.next = new ListNode(3);
        root.next.next.next.next = new ListNode(4);
        root.next.next.next.next.next = new ListNode(4);
        root.next.next.next.next.next.next = new ListNode(5);
        ListNode temp = new ListNode(-1);
        ListNode t = temp;
        while (root != null && root.next != null) {
            ListNode pre = root;
            while (root.next != null && root.val == root.next.val) {
                root = root.next;
            }
            if (pre == root) {
                temp.next = root;
                root = root.next;
                temp = temp.next;
            } else {
                root = root.next;
            }
        }
        temp.next = root;

        ListNode te = t.next;
        while (t != null) {
            System.out.println(t.val + " ----");
            t = t.next;
        }

    }
}
