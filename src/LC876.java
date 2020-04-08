/**
 * @author Micgogi
 * on 4/8/2020  2:12 PM
 * Rahul Gogyani
 */
public class LC876 {
    static Node head;
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;

        }
    }
    public static void main(String[] args) {
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next =  new Node(4);
        head.next.next.next.next = new Node(5);
        System.out.println(middleNode(head).data);
    }
    public static Node middleNode(Node head) {
        if(head==null||head.next==null){
            return  head;
        }
        Node slow = head;
        Node fast = head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
