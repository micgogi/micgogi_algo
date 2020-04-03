import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @author Micgogi
 * on 4/3/2020  2:08 PM
 * Rahul Gogyani
 */
public class LC279 {

    public static void main(String[] args) {
        try{
            BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());
            if(n==0||n==1){
                System.out.println(n);
            }else {
                int dp[] = new int[n + 1];
                Arrays.fill(dp, Integer.MAX_VALUE);
                dp[0] = 0;
                dp[1] = 1;
                for (int i = 0; i <= n; i++) {
                    for (int j = 1; j <=(int) Math.sqrt(i); j++) {
                        dp[i] = Math.min(dp[i], dp[i - (j * j)] + 1);
                    }
                }
                System.out.println(dp[n]);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
