import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 7/17/2020  5:03 PM
 * Rahul Gogyani
 */
public class LC143 {
    static Node head;
    static Node first;

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }
    static int size=0;
    public static void main(String args[]) {

        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
       head.next.next.next = new Node(4);
       head.next.next.next.next = new Node(5);
//        head.next.next.next.next.next = new Node(6);
//      head.next.next.next.next.next.next = new Node(7);
        Node temp = head;
        first = head;
        rev(temp);
        printNode(head);


    }
   static int secondsize=0;
    static Node secondNode;
    public static void rev(Node start) {
        if (start != null) {
            size++;
            rev(start.next);
            if(size<=2){
                return;
            }
            if(size%2==0&&secondsize==(size/2+1)){
                first.next = null;
                return;
            }
            if(size%2==1&&secondsize==(size/2+1)){
                secondNode.next.next = null;
                return;
            }
            Node last = start;
            if (first != null) {
                Node second = first.next;
                first.next = last;
                last.next = second;
                first=second;
                secondNode = second;
            }
           secondsize++;

        }
    }
    public static void printNode(Node head){
        while (head!=null){
            System.out.println(head.data);
            head = head.next;
        }
    }

}

