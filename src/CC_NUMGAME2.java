import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Micgogi
 * on 1/23/2020  11:12 PM
 * Micgogi
 */
public class CC_NUMGAME2 {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());
            while(t--!=0){
                long n = Long.parseLong(br.readLine());
                if((n-1)%4==0){
                    System.out.println("ALICE");
                }else {
                    System.out.println("BOB");
                }
            }
        }catch (Exception e){

        }
    }
}
