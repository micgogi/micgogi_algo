package LCDecChallenge;

import java.util.Arrays;

/**
 * @author Micgogi
 * on 5/14/2020  11:03 AM
 * Rahul Gogyani
 */
public class LC977 {
    public static void main(String[] args) {
        int a[] = {65, 78, 75, 73, 84, 65};
        for (int i = 0; i < a.length; i++) {
            a[i] = a[i] * a[i];

        }
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
