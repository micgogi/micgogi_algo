

/**
 * @author Micgogi
 * on 11/15/2020  4:21 PM
 * Rahul Gogyani
 */
public class LC938 {
    static TreeNode root;

    static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        public TreeNode(int data) {
            this.data = data;
        }
    }

    public static void main(String args[]) {
        root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(7);
        root.right.right = new TreeNode(18);
        int low = 7;
        int high = 15;
        rangeSumBST(root, low, high);
        System.out.println(sum);

    }

    static int sum = 0;

    public static void rangeSumBST(TreeNode root, int low, int high) {
        if (root == null) return;
        if (low <= root.data && root.data <= high) sum += root.data;

        rangeSumBST(root.left, low, high);
        rangeSumBST(root.right, low, high);
    }


}

