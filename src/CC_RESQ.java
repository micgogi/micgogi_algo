import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Micgogi
 * on 1/21/2020  9:29 PM
 * Micgogi
 */
public class CC_RESQ {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t= Integer.parseInt(br.readLine());
            while(t--!=0){
                int n = Integer.parseInt(br.readLine());
                int ans = n-1;
                for (int i = (int)Math.sqrt(n); i>1 ; i--) {
                    if(n%i==0){
                        int k = n/i;
                        ans = k-i;
                        break;
                    }
                }
                System.out.println(ans);
            }

        }catch (Exception e){

        }
    }
}
