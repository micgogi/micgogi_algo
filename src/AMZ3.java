import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 11/14/2021  2:55 PM
 * Rahul Gogyani
 */
public class AMZ3 {
    public static void main(String args[]) {
        System.out.println(minswap(new int[]{0, 1, 0, 1,1,0, 1}));
    }

    public static int minswap(int[] arr) {
        int count1 = 0;
        int dis = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) count1++;
            if (arr[i] == 0) dis += count1;
        }
        int count0 = arr.length - count1;
        int revCount = count0 * count1 - dis;
        System.out.println(revCount);
        return Math.min(revCount, dis);
    }

}

