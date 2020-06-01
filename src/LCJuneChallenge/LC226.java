package LCJuneChallenge;

/**
 * @author Micgogi
 * on 4/18/2020  10:24 AM
 * Rahul Gogyani
 */
public class LC226 {
    static Node root;
    static class Node {
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data = data;

        }
    }

    public static void main(String[] args) {
        root = new Node(4);
        root.left = new Node(2);
        root.right = new Node(7);
        root.left.left = new Node(1);
        root.left.right = new Node(3);
        root.right.left = new Node(6);
        root.right.right = new Node(9);
        Node n = invertTree(root);
        printPreOrder(n);


    }

    public static Node invertTree(Node root){
        if(root==null) return null;
        Node n = new Node(root.data);
        n.left = invertTree(root.right);
        n.right = invertTree(root.left);
        return n;
    }

    public static void printPreOrder(Node root){
        if(root!=null){
            System.out.println(root.data);
            printPreOrder(root.left);
            printPreOrder(root.right);
        }
    }
}
