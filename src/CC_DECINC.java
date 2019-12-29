import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Micgogi
 * on 12/29/2019 7:27 PM
 * Micgogi
 */
public class CC_DECINC {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int n = Integer.parseInt(br.readLine());
            if(n%4==0){
                System.out.println(++n);
            }else {
                System.out.println(--n);
            }
        }catch (Exception e){

        }
    }
}
