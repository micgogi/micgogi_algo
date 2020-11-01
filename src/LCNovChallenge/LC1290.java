package LCNovChallenge;

/**
 * @author Micgogi
 * on 11/1/2020  12:56 PM
 * Rahul Gogyani
 */
public class LC1290 {
    static Node head;
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data= data;
        }
    }
    public static void main(String[] args) {
        head = new Node(1);
        head.next = new Node(0);
        head.next.next = new Node(1);
        StringBuilder sb = new StringBuilder();
        while(head!=null){
            sb.append(head.data);
            head = head.next;
        }
        System.out.println(Integer.parseInt(sb.toString(),2));
    }

}

