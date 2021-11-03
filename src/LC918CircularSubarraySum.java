import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 11/3/2021  10:48 AM
 * Rahul Gogyani
 */
public class LC918CircularSubarraySum {
    public static void main(String args[]) {
        System.out.println(circularSubArraySum(new int[]{-2, -3, -1}));
    }

    public static int circularSubArraySum(int[] A) {
        int currentMax = A[0];
        int max = A[0];
        int min = A[0];
        int currentMin = A[0];
        int sum = A[0];
        for (int i = 1; i < A.length; i++) {
            currentMax = Math.max(A[i], currentMax + A[i]);
            max = Math.max(max, currentMax);
            currentMin = Math.min(A[i], currentMin + A[i]);
            min = Math.min(min, currentMin);
            sum += A[i];
        }
        if (sum == min) return max;
        return Math.max(sum - min, max);
    }
}

