/**
 * @author Micgogi
 * on 11/25/2021  9:29 AM
 * Rahul Gogyani
 */
public class LC104Test {
    static TreeNode root;
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            val=x;
        }
    }
    public static void main(String[] args) {
        root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        System.out.println(new LC104Test().maxDepth(root));
    }
    public int maxDepth(TreeNode root){
        if(root==null)return 0;
        return 1+Math.max(maxDepth(root.left),maxDepth(root.right));
    }

}

