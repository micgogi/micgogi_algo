import java.util.Arrays;
import java.util.OptionalInt;

/**
 * @author Micgogi
 * on 6/3/2020  7:52 AM
 * Rahul Gogyani
 */
public class LC354 {
    public static void main(String[] args) {
        int envelopes[][] = {{2,100},{3,200},{4,300},{5,500},{5,400},{5,250},
                {6,370},{6,360},{7,380}};
        Arrays.sort(envelopes,(a,b)->((a[0]-b[0])+(a[1]-b[1])));
        System.out.println(Arrays.deepToString(envelopes));
        int dp[] = new int[envelopes.length];
        Arrays.fill(dp,1);
        for (int i = 1; i <envelopes.length ; i++) {
            for (int j = 0; j <i ; j++) {
                int c[] = envelopes[i];
                int d[] = envelopes[j];
                if(d[0]<c[0]&&d[1]<c[1]&&dp[j]+1>dp[i]){
                    dp[i]=dp[j]+1;
                }

            }
        }
       int max=Arrays.stream(dp).max().getAsInt();
        System.out.println(max);

    }
}
