import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Micgogi
 * on 2/1/2020  9:12 PM
 * Micgogi
 */
public class CC_NUMFACT {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());
            while (t--!=0){
                int n = Integer.parseInt(br.readLine());
                String s = br.readLine();
                String s1[] = s.split(" ");
                long q = 1;
                for (int i = 0; i <s1.length ; i++) {
                    q=q*Long.parseLong(s1[i]);

                }
                for (int i = 0; i <Math.sqrt(q) ; i++) {

                }

            }
        }catch (Exception e){

        }
    }
}
