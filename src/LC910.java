import java.util.Arrays;

/**
 * @author Micgogi
 * on 12/21/2020  2:08 PM
 * Rahul Gogyani
 */
public class LC910 {
    public static void main(String args[]) {
        int A[] = {65, 78, 75, 73, 84, 65};
        System.out.println(smallestRangeII(A, 3));
    }

    public static int smallestRangeII(int[] A, int K) {
        int n = A.length;
        Arrays.sort(A);
        int ans = A[n - 1] - A[0];
        for (int i = 0; i < n - 1; i++) {
            int first = A[i];
            int second = A[i + 1];
            int high = Math.max(A[n - 1] - K, first + K);
            int low = Math.min(A[0] + K, second - K);
            ans = Math.min(ans, high - low);
        }
        return ans;
    }
}

