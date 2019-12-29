package Hashing;

import java.util.HashMap;

/**
 * @author Micgogi
 * on 12/29/2019  11:20 AM
 * Micgogi
 */
public class GH3 {
    static Node head1;
    static Node head2;
    static Node head3;
    static  Node head4;
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
             this.next = null;
        }
    }
    public  static void add(int data){
        Node n = new Node(data);
        Node temp = head3;
        head3 = n;
        head3.next = temp;
    }
    public static void main(String[] args) {
        head1 = new Node(10);
        head1.next = new Node(15);
        head1.next.next = new Node(4);
        head1.next.next.next = new Node(20);
        head2 = new Node(8);
        head2.next = new Node(4);
        head2.next.next = new Node(2);
        head2.next.next.next = new Node(10);
        HashMap<Integer, Integer> m = new HashMap<>();
        while (head1!=null){
            if(!m.containsKey(head1.data)){
                m.put(head1.data,1);
            }else {
                int i = m.get(head1.data);
                m.put(head1.data,i+1);
            }
            head1 = head1.next;
        }
        while (head2!=null){
            if(!m.containsKey(head2.data)){
                m.put(head2.data,1);
            }else {
                int i = m.get(head2.data);
                m.put(head2.data,i+1);
            }
            head2= head2.next;
        }
        for (Integer i : m.keySet()){
            if(m.get(i)==2){
                add(i);

            }
        }
        while (head3!=null){
            System.out.println(head3.data);
            head3 = head3.next;
        }
    }
}
