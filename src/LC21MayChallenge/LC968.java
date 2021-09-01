package LC21MayChallenge;

/**
 * @author Micgogi
 * on 5/16/2021  1:49 PM
 * Rahul Gogyani
 */
public class LC968 {
    static TreeNode root;
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

    public static void main(String args[]) {
       root = new TreeNode(0);
       root.left = new TreeNode(0);
       root.right = new TreeNode(0);
        System.out.println(minCameraCover(root));
    }
     static int res =0;
    public static int minCameraCover(TreeNode root) {
        return (dfs(root) < 1 ? 1 : 0) + res;
    }
    public static int dfs(TreeNode root){
       if(root==null) return 2;
       int left = dfs(root.left);
       int right = dfs(root.right);
       if(left ==0 || right ==0){
           res++;
           return 1;
       }
       return left==1 || right ==1?2:0;
    }


}

