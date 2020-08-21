/**
 * @author Micgogi
 * on 8/21/2020  11:31 AM
 * Rahul Gogyani
 */
public class LC236Pract {
    static Node root;

    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }

    public static void main(String args[]) {
        root = new Node(3);
        root.left = new Node(5);
        root.right = new Node(1);
        root.left.left = new Node(6);
        root.left.right = new Node(2);
        root.left.right.left = new Node(7);
        root.left.right.right = new Node(4);
        root.right.left = new Node(0);
        root.right.right = new Node(8);
        System.out.println(lowestCommonAncestor(root, root.left.right.left, root.left.right.right).data);
    }

    public static Node lowestCommonAncestor(Node root, Node n1, Node n2) {
        if (root == null) return null;
        if (root == n1 || root == n2) return root;
        Node left = lowestCommonAncestor(root.left, n1, n2);
        Node right = lowestCommonAncestor(root.right, n1, n2);
        if (left != null && right != null) return root;
        if (left == null && right == null) return null;
        return left != null ? left : right;
    }
}

