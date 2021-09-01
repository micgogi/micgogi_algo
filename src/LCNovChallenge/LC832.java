package LCNovChallenge;

import java.util.Arrays;

/**
 * @author Micgogi
 * on 11/10/2020  1:58 PM
 * Rahul Gogyani
 */
public class LC832 {
    public static void main(String args[]) {
        int A[][] = {{1, 1, 0,0},
                {1, 0, 0,1},
                {0, 1, 1,1},{1,0,1,0}};
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                if (A[i][j] == 1) A[i][j] = 0;
                else A[i][j] = 1;
            }
        }
        System.out.println(Arrays.deepToString(A));

        for (int i = 0; i < A.length; i++) {
            int k = 0;
            for (int j = A[i].length - 1; j >=A[i].length/2; j--) {
                int temp = A[i][j];
                A[i][j] = A[i][k];
                A[i][k] = temp;
                k++;
            }
        }
        System.out.println(Arrays.deepToString(A));

    }
}

