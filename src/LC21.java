import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Micgogi
 * on 12/14/2019  7:13 PM
 * Micgogi
 */
public class LC21 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode mergeTwoLists(ListNode head1, ListNode head2) {
        ArrayList<Integer> a = new ArrayList();
        if (head1 == null && head2 == null) {
            return head1;
        }
        while (head1 != null) {
            a.add(head1.val);
            head1 = head1.next;
        }
        while (head2 != null) {
            a.add(head2.val);
            head2 = head2.next;
        }
        Collections.sort(a);
        // System.out.println(a);
        ListNode head3 = new ListNode(a.get(0));
        ListNode temp = head3;
        for (int i = 1; i < a.size(); i++) {
            temp.next = new ListNode(a.get(i));
            temp = temp.next;

        }

        return head3;

    }
}
