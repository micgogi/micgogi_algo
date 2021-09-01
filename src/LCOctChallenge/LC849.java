package LCOctChallenge;

import java.util.Arrays;

/**
 * @author Micgogi
 * on 10/29/2020  3:55 PM
 * Rahul Gogyani
 */
public class LC849 {
    public static void main(String args[]) {
        int[] seats = {1, 0, 0, 0, 1, 0, 1};
        int[] left = new int[seats.length], right = new int[seats.length];
        Arrays.fill(left, seats.length);
        Arrays.fill(right, seats.length);
        for (int i = 0; i < seats.length; i++) {
            if (seats[i] == 1) {
                left[i] = 0;
            } else if (i > 0) left[i] = left[i - 1] + 1;

        }
        for (int i = seats.length - 1; i >= 0; i--) {
            if (seats[i] == 1) {
                right[i] = 0;
            } else if (i < seats.length - 1) right[i] = right[i + 1] + 1;
        }
        System.out.println(Arrays.toString(left));
        System.out.println(Arrays.toString(right));
        int ans = 0;
        for (int i = 0; i < seats.length; i++) {
            if (seats[i] == 0) ans = Math.max(ans, Math.min(left[i], right[i]));
        }
        System.out.println(ans);

    }
}

