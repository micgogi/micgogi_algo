import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 11/25/2021  10:02 AM
 * Rahul Gogyani
 */
public class LC94T {
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
        root = new TreeNode(1);
        root.left = new TreeNode(3);
        root.right = new TreeNode(2);
        System.out.println(new LC94T().intr(root));
    }

    public List<Integer> intr(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        helper(root, ans);
        return ans;
    }

    public static void helper(TreeNode root, List<Integer> ans) {
        if (root != null) {
            helper(root.left, ans);
            ans.add(root.val);
            helper(root.right, ans);
        }
    }
}

