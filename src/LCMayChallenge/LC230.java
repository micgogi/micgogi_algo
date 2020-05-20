package LCMayChallenge;

/**
 * @author Micgogi
 * on 5/20/2020  12:51 PM
 * Rahul Gogyani
 */
public class LC230 {


    public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode() {}
          TreeNode(int val) { this.val = val; }
          TreeNode(int val, TreeNode left, TreeNode right) {
              this.val = val;
              this.left = left;
              this.right = right;
          }
      }

    public int kthSmallest(TreeNode root, int k) {

        inorder(root,k);
        return val;
    }
    int i=0;
    int val;
    public void inorder(TreeNode root,int k){
        if(root!=null){
            inorder(root.left,k);
            i++;
            if(i==k){
                val= root.val;
                return;
            }
            inorder(root.right,k);

        }
    }
}
