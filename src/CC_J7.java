import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

/**
 * @author Micgogi
 * on 1/21/2020  11:05 PM
 * Micgogi
 */
public class CC_J7 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t= Integer.parseInt(br.readLine());
            while (t--!=0){
                String s = br.readLine();
                String s1[] = s.split(" ");
                long p = Long.parseLong(s1[0]);
                long ss = Long.parseLong(s1[1]);
                double x=(p-Math.sqrt(p*p-24*ss))/12;
                double y=(p-8*x)/4;

                DecimalFormat df = new DecimalFormat(".00");
                System.out.println( df.format(x*x*y));

            }
        }catch (Exception e){

        }
    }
}
