import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author Micgogi
 * on 6/29/2020  11:21 AM
 * Rahul Gogyani
 */
public class A1365 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while (t-- != 0) {

                int n = sc.nextInt();
                int m = sc.nextInt();
                int a[][] = new int[n + 1][m + 1];
                Set<Integer> row = new HashSet<>();
                Set<Integer> col = new HashSet<>();
                for (int i = 1; i <= n; i++) {
                    for (int j = 1; j <= m; j++) {
                        a[i][j] = sc.nextInt();
                        if (a[i][j] == 1) {
                            row.add(i);
                            col.add(j);
                        }


                    }
                }
                int min = Math.min(n - row.size(), m - col.size());
                if (min % 2 == 0) System.out.println("Vivek");
                else System.out.println("Ashish");
            }
        } catch (Exception e) {

        }
    }
}
