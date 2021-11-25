import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 11/25/2021  9:36 AM
 * Rahul Gogyani
 */
public class LC226T1 {
    static TreeNode root;

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {
        root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.right = new TreeNode(6);
        root.right.left = new TreeNode(7);
    }
    public TreeNode i(TreeNode node){
        if(node==null)return null;
        TreeNode n = new TreeNode(node.val);
        n.left = i(node.right);
        n.right = i(node.left);
        return n;
    }
}

