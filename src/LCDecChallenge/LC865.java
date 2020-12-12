package LCDecChallenge;

/**
 * @author Micgogi
 * on 12/12/2020  5:34 PM
 * Rahul Gogyani
 */
public class LC865 {
    static TreeNode root;

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    int deepest = 0;
    TreeNode lca;

    public static void main(String args[]) {
        root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);
        LC865 lc865 = new LC865();
        System.out.println(lc865.subtreeWithAllDeepest(root).val);

    }

    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        helper(root, 0);
        return lca;
    }

    public int helper(TreeNode root, int depth) {
        deepest = Math.max(deepest, depth);
        if (root == null) {
            return depth;
        }
        int left = helper(root.left, depth + 1);
        int right = helper(root.right, depth + 1);
        if (left == deepest && right == deepest) {
            lca = root;
        }
        return Math.max(left, right);
    }


}

