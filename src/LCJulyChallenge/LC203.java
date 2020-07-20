package LCJulyChallenge;

/**
 * @author Micgogi
 * on 4/4/2020  3:34 PM
 * Rahul Gogyani
 */
public class LC203 {
    static Node root;
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data  = data;

        }
    }

    public static void main(String[] args) {
        root = new Node(1);
        root.next = new Node(1);
//        root.next.next = new Node(6);
//        root.next.next.next = new Node(3);
//        root.next.next.next.next = new Node(4);
//        root.next.next.next.next.next = new Node(5);
//        root.next.next.next.next.next.next = new Node(6);

        Node temp = remove(root, 1);
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static Node remove(Node temp , int val){
        if(temp==null){
            return temp;
        }
        Node dummy =    new Node(-1);
        dummy.next = temp;
        Node curr = temp;
        Node pre = dummy;
        while(curr!=null){
            if(curr.data ==val){
                curr=curr.next;
                pre.next = curr;
            }
            else{
                pre=curr;
                curr=curr.next;

            }
        }
        return dummy.next;
    }
}
