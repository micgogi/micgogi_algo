/**
 * @author Micgogi
 * on 12/29/2020  2:38 PM
 * Rahul Gogyani
 */
public class LC1457 {
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
        root = new TreeNode(2);
        root.left = new TreeNode(3);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(1);
        root.right.right = new TreeNode(1);
        System.out.println(pseudoPalindromicPaths(root));

    }

    public static int pseudoPalindromicPaths(TreeNode root) {
        findTotalPath(root, new int[10]);
        return totalPath;

    }

    static int totalPath = 0;

    public static void findTotalPath(TreeNode root, int[] count) {
        if (root == null) return;
        count[root.val]++;
        if (root.left == null && root.right == null) {
            if (check(count)) totalPath++;
            count[root.val]--;
            return;
        }
        findTotalPath(root.left, count);
        findTotalPath(root.right, count);
        count[root.val]--;
    }

    private static boolean check(int[] count) {
        boolean flag = false;
        for (int i = 1; i <= 9; i++) {
            if ((count[i] & 1) == 0) continue;
            if (flag) return false;
            flag = true;
        }
        return true;
    }
}

