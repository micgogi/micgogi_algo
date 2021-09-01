package LCApr21Challenge;

/**
 * @author Micgogi
 * on 2/28/2020  11:11 PM
 * Micgogi
 */
public class LC509 {
    public static void main(String[] args) {
        System.out.println(fib(5));
    }

    public static int fib(int N) {
        if (N == 0) return 0;

        int j = 1, k = 1;
        for (int i = 3; i <= N; i++) {
            int l = j + k;
            j = k;
            k = l;

        }
        return k;
    }
}