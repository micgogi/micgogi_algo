import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 10/9/2020  1:11 PM
 * Rahul Gogyani
 */
public class LC499 {
    static TreeNode root;

    // Definition for a binary tree node.
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static void main(String args[]) {
        root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);
        String ser = serialize(root);
        System.out.println(ser);
        TreeNode node = deserialize(ser);
        printTreedata(node);


    }
    static void printTreedata(TreeNode root){
        if(root!=null){
            System.out.println(root.val);
            printTreedata(root.left);
            printTreedata(root.right);
        }
    }

    // Encodes a tree to a single string.
    public static String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        mySerailize(root, sb);
        return sb.toString();
    }

    public static void mySerailize(TreeNode root, StringBuilder sb) {
        if (root == null) return;
        sb.append(root.val).append(",");
        mySerailize(root.left, sb);
        mySerailize(root.right, sb);
    }

    // Decodes your encoded data to tree.
    public static TreeNode deserialize(String data) {
        if (data.isEmpty()) return null;
        Queue<String> queue = new LinkedList<>(Arrays.asList(data.split(",")));
        System.out.println(queue);
        return mydeserialize(queue, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public static TreeNode mydeserialize(Queue<String> queue, int lower, int upper) {
        if (queue.isEmpty()) return null;
        int val = Integer.parseInt(queue.peek());
        if (val < lower || val > upper) return null;
        queue.poll();
        TreeNode root = new TreeNode(val);
        root.left = mydeserialize(queue, lower, root.val);
        root.right = mydeserialize(queue, root.val, upper);
        return root;
    }

}

