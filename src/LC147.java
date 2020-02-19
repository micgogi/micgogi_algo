/*
 *@author Rahul Gogyani
 *
 * 2:57 PM 2/19/2020
 */

public class LC147 {
    static ListNode head ;
    static class ListNode{
        int val;
        ListNode next;
        public ListNode(int val){
            this.val = val;
        }

    }
    public static void main(String[] args) {
        head = new ListNode(4);
        head.next = new ListNode(2);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(3);
        ListNode cur = head;
        ListNode next = cur.next;
        while(cur!=null){
            next = cur.next;
            while(next!=null){
                if(cur.val>next.val){
                    int temp = cur.val;
                    cur.val = next.val;
                    next.val = temp;
                }
                next = next.next;
            }
            cur=cur.next;
        }
        while(head!=null){
            System.out.println(head.val);
            head = head.next;
        }
    }
}
