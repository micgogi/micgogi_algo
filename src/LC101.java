/**
 * @author Micgogi
 * on 2/29/2020  1:54 PM
 * Micgogi
 */
public class LC101 {
    static TreeNode root;
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int val){
            this.val = val;
        }

    }
    public static void main(String[] args) {
        root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);
        System.out.println(checkTree(root));

    }
    public static boolean check(TreeNode l, TreeNode r){
        if(l==null&&r==null)return true;
        if(l.val==r.val&&check(l.left,r.right)&&check(l.right,r.left)){
            return true;
        }
        if(l==null&&r!=null||l!=null&&r==null){
            return false;
        }
        else{
            return false;
        }

    }
    public static boolean checkTree(TreeNode root){
        if(root==null){
           return true;
        }
       return check(root.left,root.right);

    }
}
