package LCDecChallenge;

import java.util.Random;

/**
 * @author Micgogi
 * on 12/2/2020  8:23 PM
 * Rahul Gogyani
 */
public class LC382 {
    ListNode head;
    Random random;

    static class ListNode {
        int data;
        ListNode next;

        public ListNode(int data) {
            this.data = data;
        }
    }

    /**
     * @param head The linked list's head.
     *             Note that the head is guaranteed to be not null, so it contains at least one node.
     */
    public LC382(ListNode head) {
        this.head = head;
        this.random = new Random();
    }

    /**
     * Returns a random node's value.
     */
    public int getRandom() {
        ListNode c = head;
        int r = c.data;
        for (int i = 1; c.next != null; i++) {
            c = c.next;
            if (random.nextInt(i + 1) == i) r = c.data;
        }
        return r;
    }

    public static void main(String args[]) {
        ListNode head = new ListNode(65);
        head.next = new ListNode(78);
        head.next.next = new ListNode(75);
        head.next.next.next = new ListNode(73);
        head.next.next.next.next = new ListNode(84);
        head.next.next.next.next.next = new ListNode(65);
        LC382 lc382 = new LC382(head);
        System.out.println(lc382.getRandom());
    }

}

