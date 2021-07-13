package july21challenge;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 7/13/2021  3:17 PM
 * Rahul Gogyani
 */
public class LC162 {
    public static void main(String[] args) {
        int a[] = {65, 78, 75, 73, 84, 65};
        int n = a.length / 2;
        int i = 0;
        int index = 0;
        if (a[n] > a[n - 1]) {
            int max = a[n];
            index = n;
            for (int j = n + 1; j < a.length; j++) {
                if (max <= a[j]) {
                    index = j;
                    max = a[j];
                }
            }
        } else {
            int max = a[n];
            index = n;
            for (int j = n - 1; j >= 0; j--) {
                if (max <= a[j]) {
                    index = j;
                    max = a[j];
                }
            }
        }
        System.out.println(index);
    }
}

