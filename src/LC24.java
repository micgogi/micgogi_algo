/*
 *@author Rahul Gogyani
 *
 * 2:52 PM 2/24/2020
 */

public class LC24 {
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
        //head.next.next.next = new Node(4);

        Node dummy = new Node(-1);
        dummy.next = head;
        Node temp = dummy;
        Node f = temp.next;
        Node s = f.next;
        Node rem = s.next;
        while(temp.next!=null){

        temp.next = s;
        s.next=f;
        f.next=rem;
        temp=f;
        if(temp.next!=null&&temp.next.next!=null) {
            f = temp.next;
            s = f.next;
            rem = s.next;
        }else{
            break;
        }

        }
        while(dummy!=null){
            System.out.println(dummy.data);
            dummy = dummy.next;
        }

    }
}
