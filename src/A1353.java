import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Micgogi
 * on 6/12/2020  2:18 PM
 * Rahul Gogyani
 */
public class A1353 {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());
            while(t--!=0){
                String s[] = br.readLine().split(" ");
                long n = Long.parseLong(s[0]);
                long m = Long.parseLong(s[1]);

                System.out.println(Math.min(2,n-1)*m);
            }
        }catch (Exception e){

        }
    }
}
