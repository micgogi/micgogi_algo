import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Micgogi
 * on 1/13/2020  11:45 PM
 * Micgogi
 */
public class CC_CONFLIP {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());
            while (t-- != 0) {
                int g = Integer.parseInt(br.readLine());
                while(g--!=0) {
                    String s = br.readLine();
                    String s1[] = s.split(" ");

                    int i = Integer.parseInt(s1[0]);
                    int n = Integer.parseInt(s1[1]);
                    int q = Integer.parseInt(s1[2]);

                    if(n%2==0||i==q){
                        System.out.println(n/2);
                    }else{
                        System.out.println(n/2+1);
                    }

                }
            }
        } catch (Exception e) {

        }
    }
}
