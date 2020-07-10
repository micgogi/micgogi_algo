import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Micgogi
 * on 7/10/2020  8:59 PM
 * Rahul Gogyani
 */
public class A1360 {

    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t= Integer.parseInt(br.readLine());
            while (t--!=0){
                String s[] = br.readLine().split(" ");
                int a= Integer.parseInt(s[0]);
                int b= Integer.parseInt(s[1]);
                System.out.println((int)Math.pow(Math.min(Math.max(2*b,a),Math.max(2*a,b)),2));
            }
        }catch (Exception e){

        }
    }
}
