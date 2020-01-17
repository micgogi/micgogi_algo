import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Micgogi
 * on 1/17/2020  10:07 PM
 * Micgogi
 */
public class CC_PRIME1 {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());
            while (t--!=0){
                String s = br.readLine();
                String s1[] = s.split(" ");
                int start = Integer.parseInt(s1[0]);
                int end = Integer.parseInt(s1[1]);
                for (int i = start; i <=end ; i++) {
                    if(i==1)continue;
                    else if(isPrime(i)) System.out.println(i);

                }
                System.out.println();

            }
        }catch (Exception e){

        }
    }
    public static boolean isPrime(int n){


        for (int i = 2; i <=Math.sqrt(n) ; i++) {
            if(n%i==0)return false;

        }

        return true;
    }
}
