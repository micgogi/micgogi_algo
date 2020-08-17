import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 8/17/2020  10:15 AM
 * Rahul Gogyani
 */
public class LC122Pract {
    public static void main(String args[]) {
        int a[] = {7, 1, 5, 3, 6, 4};
        int max = 0;
        for (int i = 1; i < a.length; i++) {
            if(a[i]>a[i-1]){
                max+=a[i]-a[i-1];
            }
        }
        System.out.println(max);
    }
}

