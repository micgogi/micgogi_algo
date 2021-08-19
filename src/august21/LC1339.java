package august21;

/**
 * @author Micgogi
 * on 8/19/2021  4:12 PM
 * Rahul Gogyani
 */
public class LC1339 {
    static long sum = 0, max = 0;
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
        root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);

        System.out.println(maxProd(root));


    }



    public static void calcTotalSum(TreeNode root) {
        if (root != null) {
            sum += root.val;
            calcTotalSum(root.left);
            calcTotalSum(root.right);
        }
    }

    static long maxProd(TreeNode root) {
        sum = 0;
        max = 0;
        if (root == null) return 0;
        long left = maxProd(root.left);
        long right = maxProd(root.right);
        max = Math.max(max, (sum - left - right - root.val) * (left + right + root.val));
        return left + right + root.val;
    }

    public static int maxProduct(TreeNode root) {
        calcTotalSum(root);
        maxProd(root);
        return (int) (max % (1e9 + 7));
    }
}

