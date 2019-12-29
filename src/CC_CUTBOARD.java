import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Micgogi
 * on 12/29/2019  7:42 PM
 * Micgogi
 */
public class CC_CUTBOARD {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            int t = Integer.parseInt(br.readLine());
            while (t--!=0){
                String s = br.readLine();
                String s1[] = s.split(" ");
                int n = Integer.parseInt(s1[0]);
                int m = Integer.parseInt(s1[1]);
                System.out.println((n-1)*(m-1));
            }
        }catch (Exception j){

        }
    }
}
