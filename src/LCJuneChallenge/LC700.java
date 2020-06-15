package LCJuneChallenge;/*
 *@author Rahul Gogyani

 *
 * 12:52 PM 3/12/2020
 */


public class LC700 {
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
        root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        key(root,2);

        printTree(mainroot);

    }
        static TreeNode mainroot=null;
    public static void key(TreeNode root, int data){
        if(root==null){
            return ;
        }
        if(root.data == data){
           mainroot=root;
        }
        key(root.left, data);
        key(root.right,data);
        return ;
    }
    public static void printTree(TreeNode root){
        if(root!=null){
            System.out.println(root.data);
            printTree(root.left);
            printTree(root.right);
        }
    }
}
