import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Micgogi
 * on 5/10/2020  11:10 AM
 * Rahul Gogyani
 */
public class A1328 {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());
            while(t--!=0) {
                String s[] = br.readLine().split(" ");
                int a = Integer.parseInt(s[0]);
                int b = Integer.parseInt(s[1]);
                if (a >= b) {
                    int d = a / b;
                    System.out.println(((d + 1) * b - a)==b?0:(d + 1) * b - a);
                }else{
                    System.out.println(b-a);
                }
            }
        }catch (Exception e){
            e.printStackTrace();

        }
    }
}
