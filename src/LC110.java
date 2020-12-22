

/**
 * @author Micgogi
 * on 7/19/2020  3:35 PM
 * Rahul Gogyani
 */
public class LC110 {
    static TreeNode root;

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public static void main(String args[]) {
        root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        System.out.println(isBalanced(root));

    }

    public static boolean isBalanced(TreeNode root) {
        return height(root) != -1;
    }

    public static int height(TreeNode root) {
        if (root == null) return 0;
        int left = height(root.left);
        if (left == -1) {
            return -1;
        }
        int right = height(root.right);
        if (right == -1) {
            return -1;
        }
        if (left - right < -1 || left - right > 1) {
            return -1;
        }
        return 1 + Math.max(left, right);


    }
}

