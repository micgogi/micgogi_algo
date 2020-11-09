/**
 * @author Micgogi
 * on 11/9/2020  7:15 PM
 * Rahul Gogyani
 */
public class LC1026 {

    // Definition for a binary tree node.
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    int ans = 0;

    public int maxAncestorDiff(TreeNode root) {
        if (root == null) return 0;
        traverse(root, root.val, root.val);
        return ans;

    }

    void traverse(TreeNode root, int curMax, int curMin) {
        if (root == null) return;
        int res = Math.max(Math.abs(curMax - root.val), Math.abs(curMin - root.val));
        ans = Math.max(ans, res);
        curMax = Math.max(curMax, root.val);
        curMin = Math.min(curMin, root.val);
        traverse(root.left, curMax, curMin);
        traverse(root.right, curMax, curMin);

    }

}

