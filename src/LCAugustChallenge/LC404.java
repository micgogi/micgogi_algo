package LCAugustChallenge;/*
 *@author Rahul Gogyani

 *
 * 10:08 AM 3/12/2020
 */

public class LC404 {
    private int _xyz;
    static TreeNode root;

    public LC404(int xyz) {
        _xyz = xyz;
    }

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
        sum(root,false);
        System.out.println(sum);

    }
    static int sum=0;
    public static void sum(TreeNode root, boolean check){
        if(root==null)return;
        if(root.left==null&&root.right==null&&check){
            sum+=root.data;
        }
        sum(root.left,true);
        sum(root.right,false);
  }
}
