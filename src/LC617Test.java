import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 11/24/2021  4:24 PM
 * Rahul Gogyani
 */
public class LC617Test {
    static TreeNode root1, root2;

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {
        root1 = new TreeNode(1);
        root1.left = new TreeNode(3);
        root1.right = new TreeNode(2);
        root1.left.left = new TreeNode(5);
        root2 = new TreeNode(2);
        root2.left = new TreeNode(1);
        root2.right = new TreeNode(3);
        root2.left.right = new TreeNode(4);
        root2.right.right = new TreeNode(7);
        TreeNode ans=null;
       ans =  mergeTree(root1, root2,ans);


    }

    public static TreeNode mergeTree(TreeNode t1, TreeNode t2, TreeNode ans) {
        if(t1==null && t2==null){
            return null;
        }
        if (t1 != null && t2 != null) {
            ans = new TreeNode(t1.val + t2.val);

        }
        if (t1 == null && t2 != null) {
            ans = new TreeNode(t2.val);
        }
        if (t1 != null && t2 == null) {
            ans = new TreeNode(t1.val);
        }

        ans.left = mergeTree(t1!=null?t1.left:null, t2!=null?t2.left:null, ans.left);
        ans.right = mergeTree(t1!=null?t1.right:null, t2!=null?t2.right:null, ans.right);
        return ans;
    }

}

