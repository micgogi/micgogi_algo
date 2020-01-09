import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Micgogi
 * on 1/9/2020  11:51 PM
 * Micgogi
 */
public class CC_TEST {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            while (true){
                int n = Integer.parseInt(br.readLine());
                if(n==42){
                    break;
                }else {
                    System.out.println(n);
                }
            }
        }catch (Exception e){

        }
    }
}
