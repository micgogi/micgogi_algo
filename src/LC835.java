import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 9/6/2020  3:04 PM
 * Rahul Gogyani
 */
public class LC835 {
    public static void main(String args[]) {
        int a[][] = {{1, 1, 0}, {0, 1, 0}, {0, 1, 0}};
        int b[][] = {{0, 0, 0}, {0, 1, 1}, {0, 0, 1}};
        System.out.println(largestOverlap(a, b));
    }

    public static int largestOverlap(int[][] A, int[][] B) {
        int ans = 0;
        for (int i = -A.length; i < A.length; i++) {
            for (int j = -A[0].length; j < A[0].length; j++) {
                ans = Math.max(ans, overlap(A, B, i, j));
            }
        }
        return ans;
    }

    public static int overlap(int[][] A, int[][] B, int rowOffset, int colOffset) {
        int ans = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                if ((i + rowOffset) < 0 || i + rowOffset >= A.length || (j + colOffset) < 0 || j + colOffset >= A[0].length) {
                    continue;
                }
                if (A[i][j] == 1 && B[i + rowOffset][j + colOffset] == 1) {
                    ans++;
                }

            }
        }
        return ans;
    }
}

