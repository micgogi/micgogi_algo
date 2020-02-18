/*
 *@author Rahul Gogyani
 *
 * 10:27 AM 2/18/2020
 */

public class LC86 {
    static ListNode head ;
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
            this.next = null;
        }
    }
    public static void main(String[] args) {
        head = new ListNode(1);
        head.next = new ListNode(4);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(2);
        int x = 3;
        ListNode dummy = new ListNode(0);
        ListNode dummy1 = new ListNode(-1);
        ListNode te = dummy;
        ListNode te1 = dummy1;
        ListNode temp = head;
        while(temp!=null){
            if(temp.val>=x){
                ListNode temp1 = new ListNode(temp.val);
                te.next = temp1;
                te=temp1;

            }else{
                ListNode temp2 = new ListNode(temp.val);
                te1.next = temp2;
                te1=temp2;

            }
            temp=temp.next;
        }
        ListNode te3 = dummy1;
        while(dummy1.next!=null){
           // System.out.println(dummy.val);
            dummy1 = dummy1.next;
        }
        dummy1.next = dummy.next;
        while(te3!=null){
            System.out.println(te3.val);
            te3 = te3.next;
        }


    }
}
