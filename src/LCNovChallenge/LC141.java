package LCNovChallenge;/*
 *@author Rahul Gogyani

 *
 * 1:17 PM 3/6/2020
 */

public class LC141 {
    static Node head;
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
        }
    }

 // Definition for singly-linked list.
  public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }


    public ListNode insertionSortList(ListNode head) {
        if(head==null||head.next==null)return head;
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
        return head;
    
}
}
