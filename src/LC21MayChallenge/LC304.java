package LC21MayChallenge;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 5/12/2021  7:44 PM
 * Rahul Gogyani
 */
public class LC304 {
    public static void main(String[] args) {
        int matrix[][] = {
                {3, 0, 1, 4, 2},
                {5, 6, 3, 2, 1},
                {1, 2, 0, 1, 5},
                {4, 1, 0, 1, 7},
                {1, 0, 3, 0, 5}};
        int sum[][] = new int[matrix.length+1][matrix[0].length+1];
        for (int i = 1; i <=matrix.length ; i++) {
            for (int j = 1; j <=matrix[0].length ; j++) {
                sum[i][j]= sum[i-1][j]+sum[i][j-1]-sum[i-1][j-1]+matrix[i-1][j-1];
            }
        }
        int r1 =2,c1=1,r2=4,c2=3;
        r1++;c1++;r2++;c2++;
        System.out.println(Arrays.deepToString(sum));
        System.out.println(sum[r2][c2]-sum[r2][c1-1]-sum[r1-1][c2]+sum[r1-1][c1-1]);
    }

}
