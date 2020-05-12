/**
 * @author Micgogi
 * on 5/12/2020  10:32 AM
 * Rahul Gogyani
 */
public class LC328 {
    static Node head;
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;

        }
    }
    public static void main(String[] args) {
        head = new  Node(1);
//        head.next = new Node(2);
//        head.next.next = new Node(3);
//        head.next.next.next = new Node(4);
//      head.next.next.next.next =  new Node(5);
//       head.next.next.next.next.next = new Node(6);
      Node temp = head;
        Node odd = temp;

        Node even = temp.next;
        Node tempeven = temp.next;
        while(odd.next!=null&&even.next!=null){
           odd.next = odd.next.next;
            even.next=even.next.next;
           odd=odd.next;
            even=even.next;
           //even.next = even.next.next;
        }
        odd.next=tempeven;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }

    }
}
