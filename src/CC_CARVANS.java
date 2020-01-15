import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Micgogi
 * on 1/15/2020  10:55 AM
 * Micgogi
 */
public class CC_CARVANS {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());
            while (t-- != 0) {
                int n = Integer.parseInt(br.readLine());

                String s = br.readLine();

                String s1[] = s.split(" ");

                long a[] = new long[n];

                for (int i = 0; i < s1.length; i++) {
                    a[i] = Long.parseLong(s1[i]);
                }
                int count = 0;
                if (a.length == 1) {
                    System.out.println(++count);
                } else {
                    for (int i = 1; i < a.length; i++) {
                        if (a[i - 1] >= a[i]) {
                            count++;
                        } else {
                            a[i] = a[i - 1];
                        }

                    }
                    System.out.println(++count);
                }

            }
        } catch (Exception e) {
            // e.printStackTrace();
        }
    }
}
