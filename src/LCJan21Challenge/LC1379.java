package LCJan21Challenge;

/**
 * @author Micgogi
 * on 1/2/2021  5:42 PM
 * Rahul Gogyani
 */
public class LC1379 {


    static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        public TreeNode(int data) {
            this.data = data;
        }
    }

    public static void main(String args[]) {
        TreeNode org, clone;
        org = new TreeNode(1);
        org.left = new TreeNode(2);
        org.right = new TreeNode(3);

        clone = new TreeNode(1);
        clone.left = new TreeNode(2);
        clone.right = new TreeNode(3);
        LC1379 lc1379 = new LC1379();


        System.out.println(lc1379.getTargetCopy(org, clone, org.right ).data);

    }

    TreeNode res, target;

    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        this.target = target;
        preorder(original, cloned);
        return res;
    }

    public void preorder(TreeNode org, TreeNode clone) {
        if (org != null) {
            if (org == target) {
                res = clone;
            }
            preorder(org.left, clone.left);

            preorder(org.right, clone.right);
        }
    }
}

