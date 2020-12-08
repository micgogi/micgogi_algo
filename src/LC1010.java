import java.util.Arrays;

/**
 * @author Micgogi
 * on 12/8/2020  5:14 PM
 * Rahul Gogyani
 */
public class LC1010 {
    public static void main(String args[]) {
        int[] time = {65, 78, 75, 73, 84, 65};
        int ans = 0;
        int[] count = new int[60];
        for (int i = 0; i < time.length; i++) {
            if (time[i] % 60 == 0) {
                ans += count[0];
            } else {
                ans += count[60 - time[i] % 60];
            }
            count[time[i] % 60]++;
        }
        System.out.println(Arrays.toString(count));
        System.out.println(ans);
    }

}

