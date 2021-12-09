import com.sun.source.tree.Tree;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/**
 * @author Micgogi
 * on 12/9/2021  4:34 PM
 * Rahul Gogyani
 */
public class LC199Test {
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
    }
    public static void main(String[] args) {

    }

    public List<Integer> rightView(TreeNode root){

        List<Integer> ans = new ArrayList<>();
        if(root == null)return ans;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            int size = queue.size();
            while (size--!=0){
                TreeNode node = queue.poll();
                if(size==0)ans.add(node.val);
                if(node.left!=null)queue.add(node.left);
                if(node.right!=null)queue.add(node.right);
            }
        }
        return ans;
    }
}

