/*
 *@author Rahul Gogyani
 *
 * 10:45 AM 2/6/2020
 */


import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class LC144 {
    static TreeNode root;

    static class TreeNode {
        TreeNode left;
        TreeNode right;
        int val;

        TreeNode(int x) {
            this.val = x;
        }
    }

    static List<Integer> l = new ArrayList<>();

    public static void main(String[] args) {

        root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        System.out.println(preorderTraversal(root));

    }

    public static List<Integer> preorderTraversal(TreeNode root) {
        preorder(root);
        return l;

    }

    public static void preorder(TreeNode temp) {
        if (temp != null) {
            l.add(temp.val);
            preorder(temp.left);
            // System.out.println(temp.data);

            preorder(temp.right);
        }
    }
}
