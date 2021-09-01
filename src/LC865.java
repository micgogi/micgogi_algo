

/**
 * @author Micgogi
 * on 12/12/2020  5:34 PM
 * Rahul Gogyani
 */
public class LC865 {
    static LC1123.TreeNode root;

    static class TreeNode {
        int val;
        LC1123.TreeNode left;
        LC1123.TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    int deepest = 0;
    LC1123.TreeNode lca;

    public static void main(String args[]) {
        root = new LC1123.TreeNode(3);
        root.left = new LC1123.TreeNode(5);
        root.right = new LC1123.TreeNode(1);
        root.left.left = new LC1123.TreeNode(6);
        root.left.right = new LC1123.TreeNode(2);
        root.left.right.left = new LC1123.TreeNode(7);
        root.left.right.right = new LC1123.TreeNode(4);
        root.right.left = new LC1123.TreeNode(0);
        root.right.right = new LC1123.TreeNode(8);
        LC1123 lc1123 = new LC1123();
        System.out.println(lc1123.subtreeWithAllDeepest(root).val);

    }

    public LC1123.TreeNode subtreeWithAllDeepest(LC1123.TreeNode root) {
        helper(root, 0);
        return lca;
    }

    public int helper(LC1123.TreeNode root, int depth) {
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

