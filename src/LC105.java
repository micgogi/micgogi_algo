/*
 *@author Rahul Gogyani
 *
 * 12:25 PM 2/20/2020
 */



public class LC105 {

    static public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public static TreeNode construct(int pre, int in, int inEnd, int[] preOrder, int[] inOrder) {
        if (pre > preOrder.length - 1 || in > inEnd) return null;

        TreeNode root = new TreeNode(preOrder[pre]);

        int inIndex = 0;
        for (int i = in; i <= inEnd; i++) {
            if (root.val == inOrder[i]) inIndex = i;

        }

        root.left = construct(pre + 1, in, inIndex - 1, preOrder, inOrder);
        root.right = construct(pre + inIndex - in + 1, inIndex + 1, inEnd, preOrder, inOrder);
        return root;
    }

    public static void main(String[] args) {
        try {
            int preOrder[] = {3, 9, 20, 15, 7};
            int inOrder[] = {9, 3, 15, 20, 7};
            TreeNode root=construct(0, 0, inOrder.length - 1, preOrder, inOrder);
            inOrderTree(root);

        } catch (Exception e) {

        }
    }
    public static void inOrderTree(TreeNode temp){
        if(temp==null)return;
        inOrderTree(temp.left);
        System.out.println(temp.val);
        inOrderTree(temp.right);

    }
}
