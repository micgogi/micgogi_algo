import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 10/28/2021  6:39 PM
 * Rahul Gogyani
 */
public class LC1137DP2 {
    public static void main(String args[]) {
        System.out.println(tribonacci(5));
    }

    public static int tribonacci(int n) {
        int[] f = new int[38];
        if(n==0)return 0;
        if(n==1||n==2)return 1;
        f[0] = 0;
        f[1] = 1;
        f[2] = 1;
        for(int i=3;i<=n;i++){
            f[i]= f[i-1]+f[i-2]+f[i-3];
        }
        return f[n];

    }

}

