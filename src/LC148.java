/*
 *@author Rahul Gogyani
 *
 * 2:30 PM 2/19/2020
 */

import java.util.Arrays;
import java.util.List;

public class LC148 {
    static ListNode head;
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val= val;
        }
    }
    public static void main(String[] args) {
        head = new ListNode(4);
        head.next = new ListNode(2);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(3);
        ListNode temp = head;
        int n=0;
        while(temp!=null){
            n++;
            temp = temp.next;
        }
        int a[] = new int[n];
        temp = head;
        int i=0;
        while(temp!=null){
            a[i]=temp.val;
            i++;
            temp = temp.next;
        }
        Arrays.sort(a);
        ListNode sotr = new ListNode(a[0]);
        ListNode dummy = sotr;
        for (int j = 1; j <a.length ; j++) {
            ListNode temp2 = new ListNode(a[j]);
            dummy.next=temp2;
          dummy=temp2;
        }
        while(sotr!=null){
            System.out.println(sotr.val);
            sotr= sotr.next;
        }
    }
}
