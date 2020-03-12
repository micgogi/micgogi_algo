/*
 *@author Rahul Gogyani

 *
 * 11:37 AM 3/12/2020
 */



public class LC701 {
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

        TreeNode root3 =bst(root,5);
        print(root3);

    }
    public static TreeNode bst(TreeNode root, int data){
        if(root==null){
            root = new TreeNode(data);
        return root;
        }
        if(data<root.data){
            root.left = bst(root.left, data);
        }else{
            root.right = bst(root.right,data);
        }
        return root;

    }
    public static void print(TreeNode root){
        if(root!=null){
            System.out.println(root.data);
            print(root.left);
            print(root.right);
        }
    }
}
