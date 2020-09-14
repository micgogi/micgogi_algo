package LCSeptChallenge;

/**
 * @author Micgogi
 * on 6/4/2020  9:04 AM
 * Rahul Gogyani
 */
public class LC198 {
    public static void main(String[] args) {
        int a[] = {2,7,9,3,1};
       int dp[] = new int[a.length+1];
       dp[0] = 0;
       dp[1] = a[0];
        for (int i = 1; i <a.length ; i++) {
            dp[i+1]= Math.max(dp[i],dp[i-1]+a[i]);
        }

        System.out.println(dp[a.length]);
    }
}
