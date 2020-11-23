

/**
 * @author Micgogi
 * on 11/23/2020  3:40 PM
 * Rahul Gogyani
 */
public class LC337 {
    static TreeNode root;

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int data) {
            this.val = data;
        }
    }

    public static void main(String args[]) {
        root = new TreeNode(65);
        root.left = new TreeNode(78);
        root.right = new TreeNode(75);
        root.left.left = new TreeNode(73);
        root.left.right = new TreeNode(84);
        root.right.left = new TreeNode(65);
        System.out.println(rob(root));
    }

    public static int[] helper(TreeNode root) {
        // return [rob this node, not rob this node]
        if (root == null) return new int[]{0, 0};
        int[] left = helper(root.left);
        int[] right = helper(root.right);
        // if we rob this node, we cannot rob its children
        int rob = root.val + left[1] + right[1];
        //else we free to choose rob its children or not
        int notROb = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);
        return new int[]{rob, notROb};


    }

    public static int rob(TreeNode root) {
        int[] res = helper(root);
        return Math.max(res[0], res[1]);
    }


}

