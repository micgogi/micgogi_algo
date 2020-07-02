import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Micgogi
 * on 7/2/2020  10:42 AM
 * Rahul Gogyani
 */
public class A1371 {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());
            while(t--!=0){
                int n = Integer.parseInt(br.readLine());
                System.out.println((int)Math.ceil(1.0*n/2));
            }
        }catch (Exception e){

        }
    }
}
