package july21challenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.TreeSet;

/**
 * @author Micgogi
 * on 7/3/2021  2:50 PM
 * Rahul Gogyani
 */
public class LC363 {
    public static void main(String args[]) {
        System.out.println();
    }
    int res = Integer.MIN_VALUE;
    public void updatedResult(int[] nums, int k){
        int sum =0;
        TreeSet<Integer> sortedSum = new TreeSet<>();
        sortedSum.add(0);
        for (int num:nums){
            sum+=num;
        }
        Integer x = sortedSum.ceiling(sum-k);
        if(x!=null){
            res+=Math.max(res,sum-x);
        }
        sortedSum.add(sum);
    }
    public int maxSumSubmatrix(int[][] matrix,int k){
        int[] rowSum = new int[matrix[0].length];
        for (int i = 0; i <matrix.length ; i++) {
            Arrays.fill(rowSum,0);
            for (int j = i; j <matrix.length ; j++) {
                for (int l = 0; l <matrix[0].length ; l++) {
                    rowSum[l]+=matrix[j][l];
                }
                updatedResult(rowSum,k);
                if(res==k)
                    return res;
            }
        }
        return res;
    }
}

