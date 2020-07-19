import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 7/19/2020  11:24 AM
 * Rahul Gogyani
 */
public class LC106 {
    static  class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int val){
            this.val = val;
        }
    }
    public static void main(String args[]) {
        int inOrder[] = {9,13,15,20,7};
        int postOrder[] = {9,15,7,20,3};
        TreeNode root =buildTree(inOrder,postOrder);
        printPreorder(root);


    }
    public static TreeNode buildTree(int[] inorder, int[] postorder) {
        return construct(postorder.length-1,0,inorder.length-1,inorder,postorder);
    }
    public static TreeNode construct(int postIndex, int inStart, int inEnd, int[] inOrder, int[] postOrder){
        if(inStart>inEnd||postIndex<0)return null;
        TreeNode root = new TreeNode(postOrder[postIndex]);
        int inIndex=0;
        for(int i=inStart;i<=inEnd;i++){
            if(root.val == inOrder[i]){
                inIndex = i;
                break;
            }
        }
        root.right = construct(postIndex-1,inIndex+1,inEnd,inOrder,postOrder);
        root.left = construct(postIndex-(inEnd-inIndex+1),inStart,inIndex-1,inOrder,postOrder);

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

