import java.util.Arrays;

/**
 * @author Micgogi
 * on 6/8/2020  11:17 AM
 * Rahul Gogyani
 */
public class LC312 {
    public static void main(String[] args) {
        int b[] = {3,1,5,8};

        int[] a = new int[b.length + 2];
        int n = 1;
        for (int x : b) if (x > 0) a[n++] = x;
        a[0] = a[n++] = 1;
        System.out.println(Arrays.toString(a));
        int dp[][] = new int[a.length][a.length];
        for (int l =2; l <a.length ; l++) {
            for (int i = 0; i <a.length-l ; i++) {
                int j = i+l;
                for (int k = i+1; k <j ; k++) {
                    dp[i][j]=Math.max(dp[i][j],a[i]*a[k]*a[j]+dp[i][k]+dp[k][j]);
                }
            }
        }
        System.out.println(dp[0][a.length-1]);
    }
}
