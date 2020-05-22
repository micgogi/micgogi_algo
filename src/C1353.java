import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Micgogi
 * on 5/22/2020  9:33 AM
 * Rahul Gogyani
 */
public class C1353 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());
            while(t--!=0){
                long n = Long.parseLong(br.readLine());
                n=(n-1)/2;
                System.out.println(8*(n*(n+1)*(2*n+1)/6));
            }
        }catch (Exception e){

        }
    }
}
