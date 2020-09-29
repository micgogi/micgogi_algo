
import javax.swing.plaf.basic.BasicComboBoxUI;

/**
 * @author Micgogi
 * on 7/10/2020  2:59 PM
 * Rahul Gogyani
 */
public class LC430 {
    static Node head;

    static class Node {
        public int val;
        Node prev;
        Node next;
        Node child;

        public Node(int data) {
            this.val = data;
        }
    }

    public static void main(String[] args) {
        head = new Node(1);
        Node two = new Node(2);
        two.prev = head;
        head.next = two;
        Node three = new Node(3);
        two.next = three;
        three.prev = two;
        Node seven = new Node(7);
        Node four = new Node(4);
        three.next = four;
        three.child = seven;
        four.prev = three;
        flatten(head);


    }


    public static Node flatten(Node head){

        if(head ==null){
            return head;
        }
        Node cur = head;
        while (cur!=null){
            if(cur.child==null){
                cur = cur.next;
                continue;
            }
            Node temp = cur.child;
            while (temp.next!=null){
                temp = temp.next;
            }
            temp.next = cur.next;
            if(cur.next!=null){
                cur.next.prev = temp;
            }
            cur.next = cur.child;
            cur.child.prev = cur;
            cur.child = null;

        }
        return head;
    }
}
