import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Micgogi
 * on 1/17/2020  10:11 PM
 * Micgogi
 */
public class CC_CSUB {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());
            while(t--!=0){
                int n = Integer.parseInt(br.readLine());

                String s = br.readLine();

                long count=0;
                for (int i = 0; i <s.length() ; i++) {
                    if(s.charAt(i)=='1')count++;
                }
                // System.out.println(count);

                System.out.println((count*(count+1))/2);
            }
        }catch (Exception e){

        }
    }
}
