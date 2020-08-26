package LCAugustChallenge;

/**
 * @author Micgogi
 * on 8/25/2020  1:23 PM
 * Rahul Gogyani
 */
public class LC983 {
    public static void main(String args[]) {
        int[] days = {1, 4, 6, 7, 8, 20};
        int[] costs = {2, 7, 15};
        System.out.println(mincostTickets(days,costs));
    }

    public static int mincostTickets(int[] days, int[] costs) {
        int lastDay = days[days.length - 1];
        int[] dp = new int[lastDay + 1];
        boolean[] isTravelDay = new boolean[lastDay + 1];
        for (int day : days) isTravelDay[day] = true;
        for (int i = 1; i <= lastDay; i++) {
            if (!isTravelDay[i]) {
                dp[i] = dp[i - 1];
                continue;
            }
            dp[i] = costs[0] + dp[i - 1];
            dp[i] = Math.min(costs[1] + dp[Math.max(i - 7, 0)], dp[i]);
            dp[i] = Math.min(costs[2] + dp[Math.max(i - 30, 0)], dp[i]);

        }
        return dp[lastDay];

    }


}

