/*
 *@author Rahul Gogyani
 *
 * 5:34 PM 2/24/2020
 */

public class LC111 {
    static TreeNode root;

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int data) {
            this.val = data;

        }
    }

    public static void main(String[] args) {
        root = new TreeNode(1);
        root.left = new TreeNode(2);

        System.out.println(height(root));
    }

    public static int height(TreeNode temp) {
        if (temp == null) return 0;
        if (temp.left == null && temp.right == null) {
            return 1;
        }

        if (root.left == null)
            return 1 + height(root.right);
        if (root.right == null) {
            return 1 + height(root.left);
        }
        return Math.min(1 + height(root.left), 1 + height(root.right));

    }
}
