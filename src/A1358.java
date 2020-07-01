import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Micgogi
 * on 7/1/2020  5:07 PM
 * Rahul Gogyani
 */
public class A1358 {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());
            while (t--!=0){
                String s[] = br.readLine().split(" ");
                int m = Integer.parseInt(s[0]);
                int n = Integer.parseInt(s[1]);


                System.out.println((int)Math.ceil((1.0*m*n)/2));

            }
        }catch (Exception e){

        }
    }
}
