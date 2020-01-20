import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Micgogi
 * on 1/20/2020  9:20 PM
 * Micgogi
 */
public class CC_DIVIDING {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());
            int sum=0;
            for (int i = 1; i <=n ; i++) {
                sum+=i;
            }
            String s = br.readLine();
            String s1[] = s.split(" ");
            int sum2=0;
            for (int i = 0; i <s1.length ; i++) {
                sum2+=Integer.parseInt(s1[i]);
            }
            if(sum2==sum){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }catch (Exception e){

        }
    }
}
