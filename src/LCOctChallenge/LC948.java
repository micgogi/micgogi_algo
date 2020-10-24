package LCOctChallenge;

import java.util.Arrays;

/**
 * @author Micgogi
 * on 10/24/2020  5:44 PM
 * Rahul Gogyani
 */
public class LC948 {
    public static void main(String args[]) {
        int[] tokens = {100, 200, 300, 400};
        int P = 200;
        Arrays.sort(tokens);
        int left = 0;
        int right = tokens.length - 1;
        int points = 0, ans = 0;
        while (left <= right && (P >= tokens[left] || points > 0)) {
            while (left <= right && P >= tokens[left]) {
                P -= tokens[left++];
                points++;
            }
            ans = Math.max(points, ans);
            if (left <= right && points > 0) {
                P += tokens[right--];
                points--;
            }
        }
        System.out.println(ans);
    }
}

