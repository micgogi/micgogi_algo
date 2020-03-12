/*
 *@author Rahul Gogyani

 *
 * 10:22 AM 3/12/2020
 */

public class LC617 {
    static TreeNode root1;
    static TreeNode root2;
    static class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;
        public TreeNode(int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {
        root1 = new TreeNode(1);
        root1.left = new TreeNode(3);
        root1.right = new TreeNode(2);
        root1.left.left = new TreeNode(5);
        root2 = new TreeNode(2);
        root2.left = new TreeNode(1);
        root2.left.right = new TreeNode(4);
         root2.right = new TreeNode(3);
         root2.right.right = new TreeNode(7);
         TreeNode root4 = null;
          root4 = merge(root1,root2,root4);
         printPreorder(root4);

    }

    public static TreeNode merge(TreeNode r1, TreeNode r2,TreeNode root3){

        if(r1!=null&&r2!=null) {
            root3 = new TreeNode(r1.data+r2.data);
        }else if(r1!=null && r2==null){
            root3  = new TreeNode(r1.data);
        }else if(r1==null&&r2!=null){
            root3 = new TreeNode(r2.data);
        }else{
            return null;
        }

        root3.left = merge(r1!=null?r1.left:null,r2!=null?r2.left:null,root3!=null?root3.left:null);
        root3.right = merge(r1!=null?r1.right:null,r2!=null?r2.right:null,root3!=null?root3.right:null);
        return root3;
    }
    public static void printPreorder(TreeNode root){
        if(root!=null){
            System.out.println(root.data);
            printPreorder(root.left);
            printPreorder(root.right);
        }
    }
}
