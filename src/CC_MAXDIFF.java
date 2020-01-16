import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @author Micgogi
 * on 1/16/2020  10:42 PM
 * Micgogi
 */
public class CC_MAXDIFF {

    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());
            while(t--!=0) {
                String s = br.readLine();
                String s1[] = s.split(" ");
                int n = Integer.parseInt(s1[0]);
                int k = Integer.parseInt(s1[1]);
                int a[] = new int[n];
                String s2 = br.readLine();
                String s3[] = s2.split(" ");
                int sum=0;
                for (int i = 0; i < s3.length; i++) {
                    a[i] = Integer.parseInt(s3[i]);
                    sum+=a[i];
                }
                Arrays.sort(a);
                int csum = 0;
                int fsum = 0;
                for (int i = 0; i < k; i++) {
                    csum += a[i];
                    fsum+=a[n-i-1];
                }

                System.out.println(Math.max(Math.abs(csum-(sum-csum)),Math.abs(fsum-(sum-fsum))));
            }
        }catch (Exception e){

        }
    }
}
