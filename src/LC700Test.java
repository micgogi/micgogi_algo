import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 11/24/2021  6:05 PM
 * Rahul Gogyani
 */
public class LC700Test {
    static TreeNode root;
    static class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;
        TreeNode(int data){
            this.data=data;
        }
    }
    public static void main(String[] args) {
        root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right = new TreeNode(7);
        new LC700Test().searchBST(root, 2);
        System.out.println(ans.data);

    }
   static TreeNode ans=null;

    public void  searchBST(TreeNode root, int val) {
        if(root==null) return ;
        if(root.data==val){
            ans=root;
            return;
        }
        searchBST(root.left,val);
        searchBST(root.right,val);
        return;
    }

}

