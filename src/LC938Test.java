import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 11/24/2021  4:15 PM
 * Rahul Gogyani
 */
public class LC938Test {
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
        root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(7);
        root.right.right = new TreeNode(18);
        System.out.println(new LC938Test().rangeSumBST(root,7,15) );
    }
    public int rangeSumBST(TreeNode root, int low, int high) {
        if(root==null)return 0;
        if(root.val<low)return rangeSumBST(root.right,low,high);
        if(root.val>high)return rangeSumBST(root.left,low,high);
        return root.val+rangeSumBST(root.left,low,high)+rangeSumBST(root.right,low,high);
    }


}

