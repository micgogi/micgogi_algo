import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 12/4/2021  12:48 PM
 * Rahul Gogyani
 */
public class LC370 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new LC370().getModifiedArray(5, new int[][]{{1, 3, 2}, {2, 4, 3}, {0, 2, -2}})));
    }
    public int[] getModifiedArray(int length, int[][] updates) {
        int [] ans = new int[length];
        for (int[] u:updates){
            int start = u[0];
            int end = u[1];
            int value = u[2];
            ans[start]+=value;
            if(end+1<ans.length){
                ans[end+1]-=value;
            }
        }
        for (int i = 1; i <ans.length ; i++) {
            ans[i]+=ans[i-1];
        }
        return ans;
    }
}

