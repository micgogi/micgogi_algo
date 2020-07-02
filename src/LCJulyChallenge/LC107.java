package LCJulyChallenge;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author Micgogi
 * on 2/29/2020  3:46 PM
 * Micgogi
 */
public class LC107 {
    static TreeNode root;

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        System.out.println(levelOrder(root));
    }

//    public int height(TreeNode root){
//        if(root==null)return 0;
//        return 1+Math.max(height(root.left),height(root.right));
//    }
    public static List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);
        List<List<Integer>> list = new ArrayList<>();
        while (!q.isEmpty()){
            List<Integer> list1 = new ArrayList();
            int size = q.size();
            while(size--!=0){
                TreeNode n = q.peek();
                q.remove();
                list1.add(n.val);
                if(n.left!=null)
                    q.add(n.left);
                if(n.right!=null)
                    q.add(n.right);
            }
            list.add(list1);



        }
        List<List<Integer>>  list1= new ArrayList<>();

        for (int i = list.size()-1; i >=0 ; i--) {
            list1.add(list.get(i));
        }

        return list1;
    }
}
