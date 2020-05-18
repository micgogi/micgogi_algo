import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Micgogi
 * on 5/18/2020  8:51 AM
 * Rahul Gogyani
 */
public class A41 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String s = br.readLine();
            String t = br.readLine();
            StringBuilder sb = new StringBuilder(t);
            if(sb.reverse().toString().equals(s)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }catch (Exception e){

        }
    }
}
