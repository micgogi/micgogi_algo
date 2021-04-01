package LCMarch21Challenge;

/**
 * @author Micgogi
 * on 3/9/2020  8:08 PM
 * Rahul Gogyani
 */
public class LC160 {
    static Node head1;
    static Node head2;
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;

        }
    }
    public static void main(String[] args) {
        head1 = new Node(4);
        head1.next = new Node(1);
        head2 = new Node(5);
        head2.next = new Node(0);
        head2.next.next = new Node(1);
        Node i = new Node(8);
        i.next = new Node(4);
        i.next.next = new Node(5);
        head2.next.next.next =i;
        head1.next.next = i;

        Node A = head1;
        Node B = head2;

        while(A!=B){
            A=A!=null?A.next:head2;
            B=B!=null?B.next:head1;
        }
        System.out.println(A.data);
    }
}
