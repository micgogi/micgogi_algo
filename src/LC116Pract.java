/**
 * @author Micgogi
 * on 2/27/2020  9:53 PM
 * Micgogi
 */
public class LC116Pract {
    static LC116.Node root;
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
        root = new LC116.Node(1);
        root.left = new LC116.Node(2);
        root.right = new LC116.Node(3);
        root.left.left = new LC116.Node(4);
        root.left.right = new LC116.Node(5);
        root.right.left = new LC116.Node(6);
        root.right.right = new LC116.Node(7);

    }
    public static Node connect(Node temp){
        if(temp==null)return temp;
        if(temp.left==null&&temp.right==null)return temp;
        if(temp.left!=null&&temp.right!=null){
            temp.left.next=temp.right;
            if(temp.next!=null){
                temp.right.next= temp.next.left;
            }else{
                temp.right.next =null
            }
        }
        connect(temp.left);
        connect(temp.right);
        return temp;

    }
}
