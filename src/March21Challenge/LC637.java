package March21Challenge;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author Micgogi
 * on 3/5/2021  2:17 PM
 * Rahul Gogyani
 */
public class LC637 {
    static TreeNode root;
    static class TreeNode{
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
        System.out.println(averageOflevels(root));
    }
    public static List<Double> averageOflevels(TreeNode root){
        if(root==null) return new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        List<Double> list = new ArrayList<>();

        queue.add(root);
        while (!queue.isEmpty()){
            int size = queue.size();
            int size1 =size;
            double sum=0;
            while(size--!=0){
                double d = queue.peek().data;
                sum+=d;

                TreeNode n =queue.poll();

                if(n.left!=null)queue.add(n.left);
                if(n.right!=null)queue.add(n.right);


            }
            list.add(sum/size1);
        }
        return list;
    }
}
