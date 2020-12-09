package LCDecChallenge;

import java.util.ArrayList;

/**
 * @author Micgogi
 * on 12/9/2020  6:05 PM
 * Rahul Gogyani
 */
public class LC173 {
    static TreeNode root;
    ArrayList<Integer> arrayList;
    int i;

    // Definition for a binary tree node.
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public LC173(TreeNode root) {
        this.arrayList = new ArrayList<>();
        this.i = 0;
        inorder(root);
    }

    /**
     * @return the next smallest number
     */
    public int next() {
        return this.arrayList.get(i++);
    }

    /**
     * @return whether we have a next smallest number
     */
    public boolean hasNext() {
        return this.i<this.arrayList.size();
    }

    public void inorder(TreeNode root) {
        if (root != null) {
            inorder(root.left);
            arrayList.add(root.val);
            inorder(root.right);
        }
    }

    public static void main(String args[]) {

        root = new TreeNode(65);
        root.left = new TreeNode(78);
        root.right = new TreeNode(75);
        root.left.left = new TreeNode(73);
        root.left.right = new TreeNode(84);
        root.right.left = new TreeNode(65);
        LC173 lc173 = new LC173(root);

        System.out.println(lc173.hasNext());
        System.out.println(lc173.next());
        System.out.println(lc173.hasNext());
        System.out.println(lc173.next());
        System.out.println(lc173.hasNext());
        System.out.println(lc173.next());
        System.out.println(lc173.hasNext());
        System.out.println(lc173.next());
        System.out.println(lc173.hasNext());
        System.out.println(lc173.next());
        System.out.println(lc173.hasNext());
        System.out.println(lc173.next());
        System.out.println(lc173.hasNext());

    }


}

