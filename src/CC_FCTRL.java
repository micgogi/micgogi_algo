import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Micgogi
 * on 1/9/2020  11:52 PM
 * Micgogi
 */
public class CC_FCTRL {
    public static void main (String[] args) throws java.lang.Exception
    {

        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());
            while(t--!=0){
                long n = Long.parseLong(br.readLine());
                int sum=0;
                while(n!=0){
                    sum+=n/5;
                    n=n/5;

                }
                System.out.println(sum);
            }
        }catch (Exception e){

        }
    }
}
