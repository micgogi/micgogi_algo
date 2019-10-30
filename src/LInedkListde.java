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
    public static Node merge(Node headA , Node headB){
        if (headA == null && headB == null) return null;
        else if (headA == null) return headB;
        else if (headB == null) return headA;

        if(headA.data <= headB.data)
            headA.next = merge(headA.next, headB);
        else {
            Node temp = headB;
            headB = headB.next;
            temp.next = headA;
            headA = temp;
            headA.next = merge(headA.next, headB);
        }
        return headA;


    }

    public static void main(String[] args) {
       head =  new Node(1);
       head.next = new Node(2);
       head.next.next  = new Node(3);
       head2 = new Node(0);
       head2.next = new Node(5);

       Node n =  merge(head,head2);
       while (n!=null){
           System.out.println(n.data);
           n = n.next;
       }



    }
}
