/**
 * @author Micgogi
 * on 4/7/2020  9:43 AM
 * Rahul Gogyani
 */
public class LC235 {
    static Node root;

    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;

        }
    }

    public static void main(String[] args) {
        root = new Node(3);
        root.left = new Node(6);
        root.right = new Node(8);
        root.left.left = new Node(2);
        root.left.right = new Node(11);
        root.left.right.left = new Node(9);
        root.left.right.right = new Node(5);
        root.right.right = new Node(13);
        root.right.right.left = new Node(7);
        System.out.println(lca(root,  root.left,  root.left.right).data);
    }

    public static Node lca(Node root, Node n1, Node n2) {
        if (root == null) return null;
        if (root == n1 || root == n2) return root;

        Node left = lca(root.left, n1, n2);
        Node right = lca(root.right, n1, n2);
        if (left != null && right != null) return root;
        if (left == null && right == null) return null;
        return left!=null?left:right;
    }
}
