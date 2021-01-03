package LCJan21Challenge;

/**
 * @author Micgogi
 * on 1/3/2021  3:06 PM
 * Rahul Gogyani
 */
public class LC526 {
    public static void main(String args[]) {
        System.out.println(countArrangements(15));
    }

    static int count = 0;

    public static int countArrangements(int n) {
        if (n == 0) return 0;
        checkPermutation(n, 1, new boolean[n + 1]);
        return count;
    }

    public static void checkPermutation(int n, int i, boolean[] visited) {
        if (i > n) {
            count++;
            return;
        }
        for (int j = 1; j <= n; j++) {
            if (!visited[j] && (j % i == 0 || i % j == 0)) {
                visited[j] = true;
                checkPermutation(n, i + 1, visited);
                visited[j] = false;
            }
        }

    }
}

