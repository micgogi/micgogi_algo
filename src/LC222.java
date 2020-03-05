

public class LC222 {
    static TreeNode root;
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int val){
            this.val = val;
        }

    }
    public static void main(String[] args) {
        root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        countNode(root);
        System.out.println(count);
    }
    static int count =0;
    public static void countNode(TreeNode root){
        if(root!=null){
            count++;
            countNode(root.left);
            countNode(root.right);
        }
    }
}
