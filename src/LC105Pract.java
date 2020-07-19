import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 7/19/2020  10:39 AM
 * Rahul Gogyani
 */
public class LC105Pract {
    static  class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int val){
            this.val = val;
        }
    }
    public static void main(String args[]) {
        int preorder[] = {3,9,20,15,7};
        int inorder[] = {9,3,15,20,7};
        TreeNode root = buildTree(preorder,inorder);
        printPreorder(root);


    }
    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        return construct(0,0,inorder.length-1,preorder,inorder);
    }
    public static TreeNode construct(int pre, int in, int inEnd, int[] preorder, int[] inorder){
        if(pre>preorder.length-1||in>inEnd)return null;
        TreeNode root = new TreeNode(preorder[pre]);
        int inIndex =0;
        for (int i = in; i <=inEnd ; i++) {
            if(root.val == inorder[i])inIndex = i;
        }
        root.left = construct(pre+1, in, inIndex-1,preorder,inorder);
        root.right = construct(pre+inIndex-in+1,inIndex+1,inEnd,preorder,inorder);
        return root;
    }
    public static void printPreorder(TreeNode root){
        if(root!=null){
            System.out.println(root.val);
            printPreorder(root.left);
            printPreorder(root.right);
        }
    }
}

