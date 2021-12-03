import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 12/3/2021  7:16 PM
 * Rahul Gogyani
 */
public class LC1644 {
    static TreeNode root;
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int val){
            this.val = val;
        }

    }
    static int count =0;
    public static void main(String args[]) {
        root =new TreeNode(3);
        root.left = new TreeNode(5);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);
        root.left.right.left= new TreeNode(7);
        root.left.right.right= new TreeNode(4);
        TreeNode ans = new LC1644().lowestCommonAncestor(root,root.left,  root.left.right.right);

       System.out.println(count==2?ans.val:null);
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null) return null;

        TreeNode left = lowestCommonAncestor(root.left,p,q);
        TreeNode right = lowestCommonAncestor(root.right,p,q);
        if(root==p || root ==q){
            count++;
            return root;
        }
        if(left!=null && right!=null)return root;
        if(left!=null)return left;
        if(right!=null)return right;
        return null;
    }



}

