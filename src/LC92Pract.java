/**
 * @author Micgogi
 * on 5/12/2020  11:47 AM
 * Rahul Gogyani
 */
public class LC92Pract {
    static Node head;

    static class Node {
        Node next;
        int data;

        public Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        int m = 2;
        int n = 4;
        Node dummy = new Node(-1);
        dummy.next = head;
        Node start = dummy;
        int i = 1;
        while (i < m && start != null) {
            start = start.next;
            i++;
        }
        if(start==null||start.next==null)return;
        Node pre = start.next;
        Node cur = pre.next;
        while(i<n&&cur!=null){
            pre.next = cur.next;
            cur.next = start.next;
            start.next = cur;
            cur=pre.next;
            i++;
        }
        while(dummy!=null){
            System.out.println(dummy.data);
            dummy = dummy.next;
        }

    }
}
