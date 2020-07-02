import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Micgogi
 * on 7/2/2020  12:13 PM
 * Rahul Gogyani
 */
public class C1371 {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());
            while (t--!=0) {
                String s[] = br.readLine().split(" ");
                long a = Long.parseLong(s[0]);
                long b = Long.parseLong(s[1]);
                long n = Long.parseLong(s[2]);
                long m = Long.parseLong(s[3]);
                if (Math.min(a, b) >=m && (a + b) >= (n + m)) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            }
        }catch (Exception e){

        }
    }
}
