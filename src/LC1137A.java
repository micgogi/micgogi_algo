import java.io.BufferedReader;

/**
 * @author Micgogi
 * on 1/6/2022  1:28 PM
 * Rahul Gogyani
 */
public class LC1137A {
    public static void main(String args[]) {
        System.out.println(new LC1137A().tribocci(5));
    }

    public int tribocci(int n) {
        int[] f = new int[38];
        if (n == 0) return 0;
        if (n == 1 || n == 2) return 1;
        f[0] = 0;
        f[1] = 1;
        f[2] = 1;
        for (int i = 3; i <= n; i++) {
            f[i] = f[i - 1] + f[i - 2] + f[i - 3];
        }
        return f[n];
    }


}

