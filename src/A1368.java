import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Micgogi
 * on 7/7/2020  10:38 AM
 * Rahul Gogyani
 */
public class A1368 {
    public static void main(String[] args) {

        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());
            while (t--!=0) {
                String s[] = br.readLine().split(" ");
                int a = Integer.parseInt(s[0]);
                int b = Integer.parseInt(s[1]);
                int n = Integer.parseInt(s[2]);
                int step = 0;
                while (a <= n && b <= n) {
                    int min = Math.min(a, b);
                    if (min == a) {
                        a += b;
                    } else {
                        b += a;
                    }
                    step++;
                }
                System.out.println(step);
            }
        }catch (Exception e){

        }
    }

}
