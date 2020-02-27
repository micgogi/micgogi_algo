import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Micgogi
 * on 2/27/2020  10:03 PM
 * Micgogi
 */
public class LC69 {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());
            System.out.println((int)Math.floor(Math.sqrt(n)));
        }catch (Exception e){

        }
    }
}
