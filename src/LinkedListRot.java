public class LinkedListRot {
    static Node head;
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static void main(String[] args) {
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        Node rot =rotate(head,4);
        while(rot!=null){
            System.out.print(rot.data+"--->");
            rot = rot.next;
        }

    }

    public static Node rotate(Node temp, int k ){
        Node temp1=temp;
        while(k!=1&&temp1!=null){

            temp1=temp1.next;
            k--;
        }
        System.out.println(temp1.data);
        Node rem  = temp1.next;
        temp1.next=null;
        Node temp2 = rem;
        while(temp2.next!=null){
            temp2 = temp2.next;
        }
       temp2.next = head;
     return rem;


    }
}
