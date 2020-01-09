import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @author Micgogi
 * on 1/9/2020  11:52 PM
 * Micgogi
 */
public class CC_HORSES {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());
            while (t-- != 0) {
                int n = Integer.parseInt(br.readLine());
                long a[] = new long[n];
                String s = br.readLine();
                String s1[] = s.split(" ");
                for (int i = 0; i < a.length; i++) {
                    a[i] = Long.parseLong(s1[i]);
                }
                Arrays.sort(a);
                long min = Long.MAX_VALUE;
                long diff = 0;
                for (int i = 1; i < a.length; i++) {
                    diff = a[i] - a[i - 1];
                    if (diff < min) min = diff;
                }
                System.out.println(min);


            }
        } catch (Exception e) {

        }
    }
}
