package LCMayChallenge;

import java.util.Arrays;

/**
 * @author Micgogi
 * on 5/28/2020  2:20 PM
 * Rahul Gogyani
 */
public class LC338 {
    public static void main(String[] args) {
       int n = 5;
       int a[] = new int[n+1];
        for (int i = 0; i <=n ; i++) {
           a[i]=Integer.bitCount(i);
        }
        System.out.println(Arrays.toString(a));
    }
}
