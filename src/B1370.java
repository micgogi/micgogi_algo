import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Micgogi
 * on 6/24/2020  5:53 PM
 * Rahul Gogyani
 */
public class B1370 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());
            while (t--!=0){
                int n = Integer.parseInt(br.readLine());
                int a[] = new int[2*n];
                String s[] = br.readLine().split( " ");
                for (int i = 0; i <s.length ; i++) {
                    a[i] = Integer.parseInt(s[i]);
                }
            }
        }catch (Exception e){

        }
    }
}
