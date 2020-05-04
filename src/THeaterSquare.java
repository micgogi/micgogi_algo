import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Micgogi
 * on 5/3/2020  6:45 PM
 * Rahul Gogyani
 */
public class THeaterSquare {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String s[] = br.readLine().split(" ");
            double n = Double.parseDouble(s[0]);
            double m = Double.parseDouble(s[1]);
            double a = Double.parseDouble(s[2]);

            System.out.println((long)(Math.ceil(n/a)*Math.ceil(m/a)));

        }catch (Exception e){

        }
    }
}
