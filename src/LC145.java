import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Stack;

/**
 * @author Micgogi
 * on 7/20/2020  11:30 AM
 * Rahul Gogyani
 */
public class LC145 {
    static TreeNode root;

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public static void main(String args[]) {
        root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        System.out.println(postorderTraversal(root));
        System.out.println(preorderTraversal(root));
        System.out.println(inorderTraversal(root));
    }

    public static List<Integer> postorderTraversal(TreeNode root) {
        LinkedList<Integer> result = new LinkedList<>();
        Deque<TreeNode> stack = new ArrayDeque<>();
        TreeNode p = root;
        while (!stack.isEmpty() || p != null) {
            if (p != null) {
                stack.push(p);
                result.addFirst(p.val);
                p = p.right;
            } else {
                TreeNode node = stack.pop();
                p = node.left;
            }

        }
        return result;


        }
    public static List<Integer> inorderTraversal (TreeNode root){
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode p = root;
        while (!stack.isEmpty()||p!=null){
            if(p!=null){
                stack.push(p);
                p = p.left;
            }else{
                TreeNode node = stack.pop();
                result.add(node.val);
                p = node.right;
            }
        }
        return result;
    }
    public static List<Integer> preorderTraversal (TreeNode root){
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack =  new Stack<>();
        TreeNode p = root;
        while (!stack.isEmpty()||p!=null){
            if(p!=null){
                stack.push(p);
                result.add(p.val);
                p = p.left;

            }else{
                TreeNode  node = stack.pop();
                p = node.right;
            }
        }
        return result;

    }

}

