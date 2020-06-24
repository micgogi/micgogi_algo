import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Micgogi
 * on 6/24/2020  10:50 AM
 * Rahul Gogyani
 */
public class B200 {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());
            String s[] = br.readLine().split(" ");
            double total=0;
            for (int i = 0; i < s.length ; i++) {
                total+=Double.parseDouble(s[i]);
            }
            System.out.println(total/n);

        }catch (Exception e){

        }
    }
}
