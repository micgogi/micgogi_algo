package LCNovChallenge;

/**
 * @author Micgogi
 * on 11/21/2020  4:50 PM
 * Rahul Gogyani
 */
public class LC902 {
    public static void main(String args[]) {
        String digits[] = {"1","3","5","7"};
        int n = 3000;
        System.out.println(atMostNGivenDigitSet(digits,n));
    }

    public static int atMostNGivenDigitSet(String[] digits, int n) {
        String s = String.valueOf(n);
        int k = s.length();
        int[] dp = new int[k + 1];
        dp[k] = 1;
        for (int i = k - 1; i >= 0; i--) {
            int si = s.charAt(i) - '0';
            for (String d : digits) {
                if (Integer.valueOf(d) < si) {
                    dp[i] += Math.pow(digits.length, k - i - 1);
                } else if (Integer.valueOf(d) == si) {
                    dp[i] += dp[i + 1];
                }
            }

        }
        for (int i = 1; i < k; i++) {
            dp[0]+=Math.pow(digits.length,i);
        }
        return dp[0];
    }
}

