import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Micgogi
 * on 5/5/2020  10:41 AM
 * Rahul Gogyani
 */
public class A50 {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String s[] = br.readLine().split(" ");
            int n  = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            System.out.println((int)Math.floor(n*m*0.5));
        }catch (Exception e){

        }
    }
}
