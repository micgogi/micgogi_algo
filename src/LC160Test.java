import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 12/3/2021  8:33 PM
 * Rahul Gogyani
 */
public class LC160Test {
    static ListNode head;
    static class ListNode {
        int data;
        ListNode next;

        public ListNode(int data) {
            this.data = data;

        }
    }

    public static void main(String[] args) {

    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode A = headA;
        ListNode B= headB;
        while(A!=B){
            A=A==null?headB:A.next;
            B=B==null?headA:B.next;
        }
        return A;
    }
}

