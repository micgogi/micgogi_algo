import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 7/22/2020  11:18 AM
 * Rahul Gogyani
 */
public class LC160Pract {
    static Node headA;
    static Node headB;
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
        }
    }
    public static void main(String args[]) {
      headA = new Node(1);
      headA.next = new Node(2);
      headA.next.next = new Node(3);
      headA.next.next.next = new Node(4);
      headA.next.next.next.next = new Node(5);
      headA.next.next.next.next.next = new Node(6);
      headA.next.next.next.next.next.next = new Node(7);

      headB = new Node(65);
      headB.next = new Node(78);
      headB.next.next = new Node(75);
      headB.next.next.next =  headA.next.next.next.next.next;

        while (headA!=headB){
          headA=headA!=null?headA.next:headB;
          headB=headB!=null?headB.next:headA;
      }
        System.out.println(headA.data);

    }



}

