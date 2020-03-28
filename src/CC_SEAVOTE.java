import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Micgogi
 * on 3/28/2020  12:28 PM
 * Rahul Gogyani
 */
public class CC_SEAVOTE {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            boolean flag = false;
            int t = Integer.parseInt(br.readLine());
            while (t-- != 0) {
                int n = Integer.parseInt(br.readLine());
                long b[] = new long[n];
                String s = br.readLine();
                String s2[] = s.split(" ");
                long sum = 0;
                long count = 0;
                for (int i = 0; i < s2.length; i++) {
                    b[i] = Integer.parseInt("" + s2[i]);
                    sum += b[i];
                    if (b[i] > 0) count++;
                    if (b[i] > 100) flag = true;
                }
                if ((!flag) && (sum >= 100) && (sum - count) < 100) System.out.println("YES");
                else System.out.println("NO");


            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
