import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Micgogi
 * on 1/21/2020  9:46 PM
 * Micgogi
 */
public class CC_SPCANDY {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t= Integer.parseInt(br.readLine());
            while (t--!=0){
                String s = br.readLine();
                String s1[]= s.split(" ");
                long n = Long.parseLong(s1[0]);
                long k = Long.parseLong(s1[1]);
                if(k==0){
                    System.out.println(0+" "+n);
                }else {
                    System.out.println(n / k + " " + n % k);
                }
            }
        }catch (Exception e){

        }
    }
}
