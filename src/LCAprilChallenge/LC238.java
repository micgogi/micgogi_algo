package LCAprilChallenge;

import java.util.Arrays;

/**
 * @author Micgogi
 * on 4/15/2020  12:42 PM
 * Rahul Gogyani
 */
public class LC238 {
    public static void main(String[] args) {
        int a[] = {1,2,3,4};
        int b[] = new int[a.length];
        int t=1;
        for (int i = 0; i <a.length ; i++) {
            b[i]=t;
            t*=a[i];
        }
        t=1;
        for (int i = a.length-1; i >=0 ; i--) {
            b[i]*=t;
            t*=a[i];
        }
        System.out.println(Arrays.toString(b));
    }
}
