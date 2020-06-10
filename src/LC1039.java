/**
 * @author Micgogi
 * on 6/10/2020  3:25 PM
 * Rahul Gogyani
 */
public class LC1039 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3};
        int dp[][] = new int[arr.length][arr.length];
        for (int l = 2; l < arr.length ; l++) {
            for (int i = 0; i <arr.length-l ; i++) {
                int j = i+l;
                dp[i][j] = Integer.MAX_VALUE;
                for (int k = i+1; k <j ; k++) {
                    dp[i][j] = Math.min(dp[i][j],dp[i][k]+dp[k][j]+arr[i]*arr[k]*arr[j]);
                }
            }
        }
        System.out.println(dp[0][arr.length-1]);

    }
}
