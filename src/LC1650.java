import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 12/3/2021  8:02 PM
 * Rahul Gogyani
 */
public class LC1650 {
    static TreeNode root;
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode parent;

        public TreeNode(int val) {
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
            System.out.println(new LC1650().lowestCommonAncestor(root.left,root.right).val);
        }
        public TreeNode lowestCommonAncestor(TreeNode p, TreeNode q) {
        List<TreeNode> pPath = storePath(p);
        while(q.parent!=null){
            for(TreeNode n:pPath){
                if(n==q)return q;
            }
            q=q.parent;
        }
        return q;

        }

        public List<TreeNode> storePath(TreeNode p){
        List<TreeNode> path = new ArrayList<>();
            while(p.parent!=null){
                path.add(p);
                p = p.parent;
            }
            return path;
        }



}

