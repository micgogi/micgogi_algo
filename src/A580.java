import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @author Micgogi
 * on 5/6/2020  2:24 PM
 * Rahul Gogyani
 */
public class A580 {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());
            int a[] = new int[n];
            String s[] = br.readLine().split(" ");
            for (int i = 0; i <s.length ; i++) {
                a[i]=Integer.parseInt(s[i]);
            }

            int dp[] = new int[n];
            dp[0]=1;
            for (int i = 1; i <a.length ; i++) {
                if(a[i]>=a[i-1]){
                    dp[i]=dp[i-1]+1;
                }else{
                    dp[i]=1;
                }
            }
            int max=0;
            for (int i = 0; i <dp.length ; i++) {
                if(dp[i]>=max){
                    max=dp[i];
                }
            }
            System.out.println(max);
        }catch (Exception e){

        }
    }
}
