import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 10/4/2020  12:49 PM
 * Rahul Gogyani
 */
public class LC1288 {
    public static void main(String args[]) {
        int a[][] = {{1, 4}, {3, 6}, {2, 8}};
        Arrays.sort(a,(c,d)->c[0]-d[0]);
        // 14, 28, 36
        //System.out.println(Arrays.deepToString(a));
        int count = 1;
        int start = a[0][0];
        int end = a[0][1];
        for (int i = 1; i <a.length ; i++) {
            int first = a[i][0];
            int second = a[i][1];
            if(first>start && second > end){
                count++;
                start = first;
            }
            end = Math.max(end,second);
        }
        System.out.println(count);
    }

}

