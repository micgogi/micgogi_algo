import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 7/19/2020  3:17 PM
 * Rahul Gogyani
 */
public class LC1448 {
    static TreeNode root;
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int val){
            this.val = val;
        }
    }
    public static void main(String args[]) {
        root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(1);
        root.right.right = new TreeNode(5);
        System.out.println(goodNodes(root));

    }

    static int count = 0;
    public static int goodNodes(TreeNode root) {
       if(root==null)return 0;
       helper(root,root.val);
       return count;
    }
    public static   void helper(TreeNode root,  int max){
        if(root.val>=max){
            max = root.val;
            count++;
        }
        if(root.left!=null) {
            helper(root.left, max);
        }
        if(root.right!=null) {
            helper(root.right, max);
        }
    }


}

