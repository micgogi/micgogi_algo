public class RevLinkedList {
    static Node head;
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static void print(Node temp){
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    public static void reverseLinekdList(Node temp){
        Node current = temp;
        Node next=null;
        Node prev = null;
        while(current!=null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head=prev;
    }
    public static void reversprint(Node temp){
        if(temp!=null){
            reversprint(temp.next);
            System.out.println(temp.data);
        }
    }
    public static void main(String args[]){
        head = new Node(1);
        head.next = new  Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        //reversprint(head);
        reverseLinekdList(head);
        print(head);


    }
}
