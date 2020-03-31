import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Micgogi
 * on 3/31/2020  11:43 AM
 * Rahul Gogyani
 */
public class LC258 {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());
            System.out.println((n-1)%9+1);
        }catch (Exception e){

        }
    }
}
