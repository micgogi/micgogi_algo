package july21challenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 7/5/2021  3:58 PM
 * Rahul Gogyani
 */
public class LC566 {
    public static void main(String args[]) {
        System.out.println(Arrays.deepToString(matrixReshape(new int[][]{{1,2},{3,4}},2,2)));
    }

    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        int[][] ans = new int[r][c];
        int n = mat.length;
        int m = mat[0].length;
        if(r*c!=n*m)return mat;

        for (int i = 0; i <r*c ; i++) {
            ans[i/c][i%c]=mat[i/m][i%m];
        }
        return ans;
    }


}

