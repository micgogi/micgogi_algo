import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Inet4Address;

/**
 * @author Micgogi
 * on 5/11/2020  9:58 AM
 * Rahul Gogyani
 */
public class B1335 {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());
            while(t--!=0){
                String s[] = br.readLine().split(" ");
                int n = Integer.parseInt(s[0]);
                int a = Integer.parseInt(s[1]);
                int b = Integer.parseInt(s[2]);
                for (int i = 0; i <n ; i++) {
                    System.out.print((char)('a'+(i%b)));
                }
                System.out.println();
            }
        }catch (Exception e){

        }
    }
}
