package LCOctChallenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 7/20/2020  12:50 PM
 * Rahul Gogyani
 */
public class LC189 {
    public static void main(String args[]) {
        int a[] = {65, 78, 75, 73, 84, 65};
        int k = 2;
        k%=a.length;
        reverse(a,0,a.length-1);
        reverse(a,0,k-1);
        reverse(a,k,a.length-1);
        System.out.println(Arrays.toString(a));
//        reverse(a,k);
//        System.out.println(Arrays.toString(a));
    }

    public static void reverse(int a[], int k) {

        while (k-- != 0) {
            int n = a[a.length - 1];

            for (int i = a.length - 1; i > 0; i--) {
                a[i] = a[i - 1];

            }
            a[0] = n;

        }

    }
    //optimized
    public static void reverse(int a[], int start, int end){
        while (start<end){
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
    }
}

