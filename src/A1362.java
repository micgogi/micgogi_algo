import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Micgogi
 * on 6/17/2020  11:02 AM
 * Rahul Gogyani
 */
public class A1362 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());
            while (t-- != 0) {
                String s[] = br.readLine().split(" ");
                long a = Long.parseLong(s[0]);
                long b = Long.parseLong(s[1]);
                long c = Math.min(a, b);
                long d = Math.max(a, b);
                long r = 0, q = 0;
                if (d % c == 0) {
                    q = d / c;
                }
                if (q == 0) r = 1;
                else {
                    while (q != 1) {
                        if (q >= 8 && q % 8 == 0) {
                            q = q / 8;
                            r++;
                        } else if (q >= 4 && q % 4 == 0) {
                            q = q / 4;
                            r++;
                        } else if (q >= 2 && q % 2 == 0) {
                            q = q / 2;
                            r++;
                        } else {
                            r = -1;
                            break;
                        }
                    }

                }
                System.out.println(r);
                t--;
            }
        } catch (Exception e) {

        }
    }
}
