import com.sun.source.tree.Tree;

/**
 * @author Micgogi
 * on 12/3/2021  6:32 PM
 * Rahul Gogyani
 */
public class LC236Test{
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
        root =new TreeNode(3);
        root.left = new TreeNode(5);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);
        root.left.right.left= new TreeNode(7);
        root.left.right.right= new TreeNode(4);
        System.out.println(new LC236Test().lowestCommonAncestor(root,root.left,root.right).val);
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null) return null;
        if(root==p || root ==q)return root;
        TreeNode left = lowestCommonAncestor(root.left,p,q);
        TreeNode right = lowestCommonAncestor(root.right,p,q);
        if(left!=null && right!=null)return root;
        if(left!=null)return left;
        if(right!=null)return right;
        return null;
    }

}

