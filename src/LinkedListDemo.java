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
    public static void printAfterNode(int data, int k){
        Node n = new Node(data);
        Node temp = head;
        while(temp.data!=k){
            temp = temp.next;
        }
        Node temp1 = temp.next;
        temp.next=n;
        n.next=temp1;
    }
    public static void printList(Node temp){
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    public static void printAtTheEnd(int data){
        Node n = new Node(data);
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next=n;
    }
    public static void insertAtStart(int data){
        Node n = new Node(data);
        Node temp = head;
        head=n;
        head.next =temp;

    }
    public static void main(String args[]){
        head = new Node(1);
        Node two = new  Node(2);
        Node three = new Node(3);
        Node four = new Node(4);
        head.next = two;
        two.next = three;
        three.next = four;
       // printList(head);
       // insertAtStart(0);
      //  printAtTheEnd(9);
        printAfterNode(7,3);
        printList(head);


    }
}
