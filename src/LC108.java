import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 7/19/2020  3:03 PM
 * Rahul Gogyani
 */
public class LC108 {
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int val){
            this.val = val;
        }
    }
    public static void main(String args[]) {
        int a[] = {-10,-3,0,5,9};
        TreeNode root = sortedArrayToBST(a);
        printPreorder(root);
    }

    public static TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length == 0)return null;
        return constructBST( nums, 0, nums.length-1);
    }
    public static TreeNode constructBST(int nums[],int start, int end){
        if(start>end)return null;
        int mid = (start+end)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = constructBST(nums,start,mid-1);
        root.right = constructBST(nums,mid+1,end);
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

