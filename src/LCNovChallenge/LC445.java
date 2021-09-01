package LCNovChallenge;

import java.util.Stack;

/**
 * @author Micgogi
 * on 11/7/2020  3:58 PM
 * Rahul Gogyani
 */
public class LC445 {
    static ListNode head1;
    static ListNode head2;
    // Definition for singly-linked list.
    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void main(String args[]) {
       // (7 -> 2 -> 4 -> 3) + (5 -> 6 -> 4)
        head1 = new ListNode(7);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(4);
        head1.next.next.next = new ListNode(3);
        head2 = new ListNode(5);
        head2.next = new ListNode(6);
        head2.next.next = new ListNode(4);
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        while (head1!=null){
            stack1.push(head1.val);
            head1 = head1.next;
        }
        while (head2!=null){
            stack2.push(head2.val);
            head2 = head2.next;
        }
        int sum = 0;
        ListNode res = new ListNode(0);
        while (!stack1.isEmpty()||!stack2.isEmpty()){
            if(!stack1.isEmpty())sum+=stack1.pop();
            if(!stack2.isEmpty())sum+=stack2.pop();
            res.val = sum%10;
            ListNode head = new ListNode(sum/10);
            head.next = res;
            res = head;
            sum/=10;
        }
        while (res!=null){
            System.out.println(res.val);
            res = res.next;
        }
    }
}

