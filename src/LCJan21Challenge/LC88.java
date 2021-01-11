package LCJan21Challenge;

import java.util.Arrays;

/**
 * @author Micgogi
 * on 1/18/2020  4:59 PM
 * Micgogi
 */
public class LC88 {
    public static void main(String[] args) {
        int a[] = {1,2,3,0,0,0};
        int b[] = {2,5,6};
        int m = 3;
        int n = 3;
        for (int i = m,j=0; i <m+n&&j<n ; i++,j++) {
            a[i]=b[j];
        }
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
