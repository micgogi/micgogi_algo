import com.sun.source.tree.Tree;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/**
 * @author Micgogi
 * on 11/22/2021  8:18 PM
 * Rahul Gogyani
 */
public class LC102LevelOrderTraversal {
    static TreeNode root;
    static  class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;
        public TreeNode(int data){
            this.data = data;
        }
    }

    public static void main(String[] args) {
        root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        System.out.println(new LC102LevelOrderTraversal().levelOrder(root));
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()){
            int size = q.size();
            List<Integer> level = new ArrayList<>();
            while(size--!=0){
                TreeNode node = q.poll();
                if(node.left!=null)q.add(node.left);
                if(node.right!=null)q.add(node.right);
                level.add(node.data);
            }
            res.add(level);
        }
        return res;
    }

}

