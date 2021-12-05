import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 12/5/2021  2:24 PM
 * Rahul Gogyani
 */
public class LC1120 {
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
    }
    public static void main(String[] args) {

    }
    public double maximumAverageSubtree(TreeNode root){
        return maxAvg(root)[2];
    }
    public double[] maxAvg(TreeNode root){
        if(root ==null)return new double[]{0,0,0};
        double[] left = maxAvg(root.left);
        double[] right = maxAvg(root.right);
        double sum = root.val+left[0]+right[0];
        double count = 1+left[1]+right[1];
        double childMax = Math.max(left[2],right[2]);
        double max = Math.max(childMax,sum/count);
        return new double[]{sum,count,max};
    }


}

