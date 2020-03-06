/*
 *@author Ragul Gogyani

 *
 * 1:17 PM 3/6/2020
 */

public class LC142 {
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
//        head.next.next = new Node(3);
//        head.next.next.next = new Node(4);
        head.next.next=head;
        System.out.println(cycle(head).next.data);
    }

    public static Node cycle(Node temp){
        Node slow = temp;
        Node fast = temp;
        while(slow!=null&fast!=null&& fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                slow = temp;
                while(slow!=fast){
                    slow=slow.next;
                    fast=fast.next;
                }
                return slow;
            }
        }
        return null;
    }
}
