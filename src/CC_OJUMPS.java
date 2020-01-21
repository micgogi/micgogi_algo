import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Micgogi
 * on 1/21/2020  9:32 PM
 * Micgogi
 */
public class CC_OJUMPS {	public static void main (String[] args) throws java.lang.Exception
{
    // your code goes here
    try{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        long n = Long.parseLong(br.readLine());
        if (n % 6 == 0 || n % 6 == 1 || n % 6 == 3) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

    }catch (Exception e){

    }
}
}
