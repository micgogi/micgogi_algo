import com.sun.source.tree.Tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * @author Micgogi
 * on 12/9/2021  4:51 PM
 * Rahul Gogyani
 */
public class LEftView {
    static TreeNode root;
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int val){
            this.val =val;
        }

    }
    public static void main(String args[]) {
      root = new TreeNode(1);
      root.left = new TreeNode(2);
      root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        root.left.left.left = new TreeNode(345);
        System.out.println(new LEftView().leftView(root));
    }
    public List<Integer> leftView(TreeNode root){
        List<Integer> ans = new ArrayList<>();
        if(root == null)return ans;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            int size =queue.size();
            int i=0;
            while (size--!=0){
                TreeNode node = queue.poll();
                if(i==0)ans.add(node.val);
                i++;
                if(node.left!=null)queue.add(node.left);
                if(node.right!=null)queue.add(node.right);
            }
        }
        return ans;
    }


}

