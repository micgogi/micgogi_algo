public class LinkedListDemo {
    static Node head;
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data= data;
            this.next = null;
        }
    }
    public static void printList(Node temp){
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    public static void main(String args[]){
        head = new Node(1);
        Node two = new  Node(2);
        Node three = new Node(3);
        Node four = new Node(4);
        head.next = two;
        two.next = three;
        three.next = four;
        printList(head);

    }
}
