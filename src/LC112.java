/**
 * @author Micgogi
 * on 3/2/2020  10:57 PM
 * Micgogi
 */
public class LC112 {
    static TreeNode root;
    static public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int val){
            this.val = val;
        }
    }
    static int target =0;
    public static boolean hasSum(TreeNode root, int sum){
        if(root==null)return false;
        if(root.left==null&&root.right==null&&sum==root.val) {
            return true;

        }

        return hasSum(root.left,sum-root.val)||hasSum(root.right,sum-root.val);
    }
    public static void main(String[] args) {
        root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        System.out.println(  hasSum(root,22));

    }
}
