package LCNovChallenge;

/**
 * @author Micgogi
 * on 11/8/2020  2:13 PM
 * Rahul Gogyani
 */
public class LC563 {
    static Node root;

    static class Node {
        Node left;
        Node right;
        int data;

        public Node(int data) {
            this.data = data;
        }
    }

    public static void main(String args[]) {
        root = new Node(65);
        root.left = new Node(78);
        root.right = new Node(75);
        root.left.left = new Node(73);
        root.left.right = new Node(84);
        root.right.left = new Node(65);
        traversal(root);
        System.out.println(totalsum);

    }

    static int totalsum = 0;

    public static int traversal(Node root) {
        if (root == null) return 0;
        int left = traversal(root.left);
        int right = traversal(root.right);
        totalsum += Math.abs((left - right));
        return root.data + left+right;
    }
}

