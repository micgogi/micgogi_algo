import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 11/3/2021  11:07 AM
 * Rahul Gogyani
 */
public class maxSubarrayProduct {
    public static void main(String args[]) {
        System.out.println(maxProduct(new int[]{2, 3, -2, 4,2, 4}));
    }

    public static int maxProduct(int[] A) {
        int pr = 1;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < A.length; i++) {
            max = Math.max(max, pr *= A[i]);
            if (A[i] == 0) pr = 1;
        }
        pr =1;
        for (int i = A.length-1; i >=0 ; i--) {
            max = Math.max(max,pr*=A[i]);
            if(A[i]==0)pr=1;
        }

        return  max;

    }
}

