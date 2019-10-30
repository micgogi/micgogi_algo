public class LInedkListde {
    static  Node head;
    static  Node head2;
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static void print(Node temp){
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    public static Node merge(Node temp1 , Node twmp2){
        Node temp2=temp1;
        while(temp1.next!=null){

            //System.out.println(temp1.data);
            temp1=temp1.next;
        }
       // System.out.println(temp1.data);
        temp1.next=twmp2;
        return temp2;


    }

    public static void main(String[] args) {
       head =  new Node(1);
       head.next = new Node(2);
       head.next.next  = new Node(3);
       head2 = new Node(4);
       head2.next = new Node(5);

       Node n =  merge(head,head2);
       while (n!=null){
           System.out.println(n.data);
           n = n.next;
       }



    }
}
