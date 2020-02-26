/*
 *@author Rahul Gogyani
 *
 * 3:09 PM 2/26/2020
 */

public class LC237 {
    static ListNode head;
    static class ListNode{
        int data;
        ListNode next;
        public ListNode(int val){
            this.data = val;
        }
    }

    public static void main(String[] args) {
        head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        deleteNode(head.next);
        while(head!=null){
            System.out.println(head.data);
            head= head.next;
        }

    }
    public static void deleteNode(ListNode node) {
        ListNode temp = node.next;;
        node.data = temp.data;
        node.next=temp.next;
    }
}
