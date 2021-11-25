import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 11/24/2021  6:28 PM
 * Rahul Gogyani
 */
public class LC1022Test {
    static TreeNode root;
  static class TreeNode{
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x){
          val=x;
      }
  }

    public static void main(String[] args) {
        root = new  TreeNode(1);
        root.left = new TreeNode(0);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(1);
        root.right = new TreeNode(1);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(1);
        System.out.println(new LC1022Test().sumRootToLeaf(root));
    }

    public int sumRootToLeaf(TreeNode root) {
         sumRootToLLeaf(root,0);
         return sum;
    }
    int sum=0;
    public void sumRootToLLeaf(TreeNode root, int val){
      if(root==null) return;
      if(root.left==null&&root.right==null){
          val=val*2+root.val;
          sum+=val;
      }
      val = val*2+root.val;
      sumRootToLLeaf(root.left,val);
      sumRootToLLeaf(root.right,val);

    }

}

