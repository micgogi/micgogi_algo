package LCAprilChallenge;

/**
 * @author Micgogi
 * on 4/30/2020  1:08 PM
 * Rahul Gogyani
 */
public class CheckIfaStringIsaValidSequencefromRoottoLeavesPathinaBinaryTree {
    static TreeNode root;
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int data){
            this.val = data;
        }
    }
    public static void main(String[] args) {
        int arr[] ={0,0,1};
        root = new TreeNode(0);
        root.left = new TreeNode(1);
        root.right = new TreeNode(0);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(1);
        root.left.left.left = new TreeNode(1);
        root.left.right.left = new TreeNode(0);
        root.left.right.right = new TreeNode(0);
        root.right.left = new TreeNode(0);
        System.out.println(isValidSequence(root,arr));

    }

    public static boolean isValidSequence(TreeNode root, int[] arr) {
        return dfs(root,0,arr,arr.length);
    }
    public static boolean dfs(TreeNode root, int i, int arr[], int n){
        if(i==n-1){
            if(root!=null) {
                return root.val == arr[i] && root.left == null && root.right == null;
            }
        }
        if(root==null){
            return false;

        }
        if(root.val == arr[i]){
            return dfs(root.left,i+1,arr,n)||dfs(root.right,i+1,arr,n);
        }
        return false;

    }
}
