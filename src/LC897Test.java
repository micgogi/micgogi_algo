import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 11/24/2021  4:51 PM
 * Rahul Gogyani
 */
public class LC897Test {
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
        root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(7);
        root.left.left.left = new TreeNode(1);
        new LC897Test().increasingBST(root);

    }
    TreeNode temp;

    public TreeNode increasingBST(TreeNode root) {
        TreeNode ans = new TreeNode(0);
        temp = ans;
        inorder(root);
        return ans.right;
    }
    public  void inorder(TreeNode root){
        if(root!=null){
            inorder(root.left);
            root.left=null;
            temp.right=root;
            temp =root;
            inorder(root.right);
        }
    }
}

