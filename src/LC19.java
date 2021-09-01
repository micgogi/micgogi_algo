/**
 * @author Micgogi
 * on 12/14/2019  10:10 PM
 * Micgogi
 */
public class LC19 {
    static Node root;
    static  class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node removeNthElement(Node temp, int n){
        int i=0;
        Node prev=null;
        while ((i+1)!=n){
            System.out.println(temp.data);
            prev = temp;
            temp = temp.next;
            i++;
        }
        //System.out.println(prev.data);
        prev.next = temp.next;
        return null;
    }
    public static Node removeNthElementFromEnd(Node temp, int n){
        Node dummy = new Node(0);
        dummy.next = temp;
        Node f = dummy;
        Node s = dummy;
        for (int i = 0; i <=n; i++) {
            f = f.next;
        }
        while (f!=null){
            f=f.next;
            s=s.next;
        }
        s.next = s.next.next;
        return dummy.next;
    }
    public static void main(String[] args) {
        root = new Node(1);
        root.next = new Node(2);
        root.next.next = new Node(3);
        root.next.next.next = new Node(4);
        root.next.next.next.next = new Node(5);
        removeNthElement(root,2);
//        while (root!=null){
//            System.out.println(root.data);
//            root = root.next;
//        }
        Node temp = removeNthElementFromEnd(root,1);
        while (temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
