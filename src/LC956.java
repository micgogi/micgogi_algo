import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 11/25/2021  10:12 AM
 * Rahul Gogyani
 */
public class LC956 {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
    public boolean isUnivalTree(TreeNode root) {

        Set<Integer> set = new HashSet<>();
        helper(root,set);
        return set.size()==1;

    }

    public void helper(TreeNode root,Set<Integer> set){
        if(root!=null){
            set.add(root.val);
            helper(root.left,set);
            helper(root.right,set);
        }
    }

}

