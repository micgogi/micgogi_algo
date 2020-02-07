
import java.util.ArrayList;
import java.util.List;

public class LC94 {
    static class TreeNode{
        TreeNode left;
        TreeNode right;
        int val;
    }
    List<Integer> l = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        inorder(root);
        return l;

    }

     public  void inorder(TreeNode temp){
        if(temp!=null){
            inorder(temp.left);
           // System.out.println(temp.data);
            l.add(temp.val);
            inorder(temp.right);
        }
    }
}
