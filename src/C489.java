import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Micgogi
 * on 5/18/2020  9:17 AM
 * Rahul Gogyani
 */
public class C489 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String s[] = br.readLine().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            int sum1 = m, sum2 = m - 1;
            if ((m == 0) && n != 1 || (m > 9 * n)) {
                System.out.println("-1 -1");
                return;

            }
            String a = "", b = "";
            for (int i = 0; i <n ; i++) {
                a+=Math.min(9,sum1);
                sum1-=Math.min(9,sum1);
            }
            for (int i = 0; i <n-1 ; i++) {
                b=Math.min(9,sum2)+b;
                sum2-=Math.min(9,sum2);
            }
            b=sum2+1+b;
            System.out.println(b+" "+a);
        } catch (Exception e) {

        }
    }
}
