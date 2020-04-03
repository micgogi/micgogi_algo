import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.management.BufferPoolMXBean;

/**
 * @author Micgogi
 * on 4/3/2020  1:48 PM
 * Rahul Gogyani
 */
public class LC204 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());
            boolean prime[] = new boolean[n];
            for (int i = 2; i <n ; i++) {
                prime[i]=true;
            }
            for (int i = 2; i <=Math.sqrt(n) ; i++) {
                if(prime[i]){
                    for (int j = i*2; j <n ; j+=i) {
                        prime[j]=false;
                    }
                }
            }
            int ic=0;
            for (int i = 2; i <n ; i++) {
                if(prime[i])ic++;
            }
            System.out.println(ic);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
