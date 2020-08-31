package LCAugustChallenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 7/14/2020  11:50 AM
 * Rahul Gogyani
 */
public class LC450 {

    //Definition for a binary tree node.
    static public class TreeNode {
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

    static TreeNode root;

    public static void main(String args[]) {
        FastReader sc = new FastReader();
        root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(7);
       TreeNode node = delete(root,5);
        preorder(node);

    }
    public static void preorder(TreeNode root){
        if(root!=null){
            System.out.println(root.val);
            preorder(root.left);
            preorder(root.right);
        }
    }

    public static TreeNode delete(TreeNode root, int key) {
        if (root == null)
            return null;
        if (key < root.val) {
            root.left = delete(root.left, key);

        } else if (key > root.val) {
            root.right = delete(root.right, key);
        } else {
            if(root.left==null){
                return root.right;
            }
            else if(root.right==null){
                return root.left;
            }
            TreeNode min = findMin(root.right);
            root.val = min.val;
            root.right = delete(root.right,root.val);

        }
        return root;
    }
    private static TreeNode findMin(TreeNode node){
        while(node.left != null){
            node = node.left;
        }
        return node;
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in), 32768);
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

}

