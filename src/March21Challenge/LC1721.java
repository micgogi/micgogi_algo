package March21Challenge;

import java.util.Arrays;

/**
 * @author Micgogi
 * on 3/14/2021  3:09 PM
 * Rahul Gogyani
 */
public class LC1721 {
    static ListNode head;

    static class ListNode {
        int data;
        ListNode next;

        public ListNode(int data) {
            this.data = data;
        }
    }

    public static void main(String args[]) {
        head = new ListNode(65);
        head.next = new ListNode(78);
        head.next.next = new ListNode(75);
        head.next.next.next = new ListNode(73);
        head.next.next.next.next = new ListNode(84);
        head.next.next.next.next.next = new ListNode(65);

        swapNodes(head, 2);

    }

    public static ListNode swapNodes(ListNode head, int k) {

        ListNode temp = head;
        int size = 0;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        int[] a = new int[size + 1];
        temp = head;
        int index = 1;
        while (temp != null) {
            a[index++] = temp.data;
            temp = temp.next;
        }
        int t = a[k];
        a[k] = a[a.length - k];
        a[a.length - k] = t;
        System.out.println(head.data);
        temp = head;

        for (int i = 1; i < a.length; i++) {
            temp.data = a[i];
            temp = temp.next;
        }
        System.out.println(Arrays.toString(a));

        return head;
    }
}

