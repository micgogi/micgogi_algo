

/**
 * @author Micgogi
 * on 4/2/2021  12:51 PM
 * Rahul Gogyani
 */
public class LC474 {
    public static void main(String args[]) {
        System.out.println(findMaxForm(new String[]{"10", "0001", "111001", "1", "0"}, 5, 3));
    }

    public static int findMaxForm(String[] strs, int m, int n) {

        int[][] dp = new int[m + 1][n + 1];
        for (String s : strs) {
            int count1 = 0;
            int count0 = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '0') count0++;
                if (s.charAt(i) == '1') count1++;
            }
            for (int i = m; i >= count0; i--) {
                for (int j = n; j >= count1; j--) {

                    dp[i][j] = Math.max(dp[i][j], dp[i - count0][j - count1] + 1);

                }
            }

        }

        return dp[m][n];
    }
}

