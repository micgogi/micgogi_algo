package LCNovChallenge;

/**
 * @author Micgogi
 * on 2/26/2020  11:17 PM
 * Micgogi
 */
public class LC116 {
    static Node root;
    static class Node{
        int val;
        Node left;
        Node right;
        Node next;
        public Node(int data){
            this.val = data;
        }
    }

    public static void main(String[] args) {
        root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        connect(root);
    }
    public static Node connect(Node temp){
        if(temp==null)return temp;
        if(temp.left==null&&temp.right==null)return temp;
        if(temp.left!=null&&temp.right!=null){
            temp.left.next=temp.right;
            if(temp.next!=null)temp.right.next = temp.next.left;
            else{
                temp.right.next =null;
            }
        }
        connect(temp.left);
        connect(temp.right);

        return temp;
    }
}
