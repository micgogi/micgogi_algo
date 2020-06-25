import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Micgogi
 * on 6/25/2020  10:12 AM
 * Rahul Gogyani
 */
public class C1370 {
    private static final int CONS= 50000;

    public static boolean checkPrime(int n) {
        for (int i = 2; i < Math.min(n,CONS); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int t = Integer.parseInt(br.readLine());
            while (t-- != 0) {
                int n = Integer.parseInt(br.readLine());
                boolean lose = (n == 1);
                if (n > 2 && n % 2 == 0) {
                    if ((n & (n - 1)) == 0) {
                        lose = true;

                    } else if (n % 4 != 0 && checkPrime(n / 2)) {
                        lose = true;
                    }
                }
                if (lose)
                    System.out.println("FastestFinger");
                else System.out.println("Ashishgup");
            }
        } catch (Exception e) {

        }
    }
}
