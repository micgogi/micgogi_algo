

/**
  * @author Micgogi
  * on 4/11/2021  2:53 PM
  * Rahul Gogyani
  */
public class LC1302 {
    static TreeNode root;
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int val){
            this.val = val;
        }
    }
    public static void main(String args[]){
        root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(6);
        root.left.left.left= new TreeNode(7);
        root.right.right.right = new TreeNode(8);
        height(root,0);
        System.out.println(sum);
    }
    static int sum =0;
     static int max =0;
    public static void height(TreeNode root, int level){
        if(root==null)return;
        if(level>max){
            max = level;
            sum =0;

        }
        if(max ==level){
            sum+=root.val;
        }
        height(root.left,1+level);
        height(root.right,1+level);
    }

}

