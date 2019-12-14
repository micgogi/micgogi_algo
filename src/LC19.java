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
    public static void main(String[] args) {
        root = new Node(1);
        root.next = new Node(2);
        root.next.next = new Node(3);
        root.next.next.next = new Node(4);
        root.next.next.next.next = new Node(5);
        removeNthElement(root,2);
        while (root!=null){
            System.out.println(root.data);
            root = root.next;
        }
    }
}
