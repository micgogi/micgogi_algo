package LCDecChallenge;

public class LC104 {

    static TreeNode root;

    static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        public TreeNode(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        System.out.println(maxDepth(root));

    }

    public static int maxDepth(TreeNode root) {
        if (root == null) {

            return 0;
        }
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}
