import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 11/9/2021  7:31 PM
 * Rahul Gogyani
 */
public class LC1380 {
    public static void main(String args[]) {
        System.out.println(luckyNumbers(new int[][]{{3, 7, 8}, {9, 11, 13}, {15, 16, 17}}));
    }

    public static List<Integer> luckyNumbers(int[][] matrix) {
        int mi[] = new int[matrix.length];
        int mx[] = new int[matrix[0].length];
        Arrays.fill(mi,Integer.MAX_VALUE);
        Arrays.fill(mx,Integer.MIN_VALUE);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                mi[i] = Math.min(mi[i], matrix[i][j]);
                mx[j] = Math.max(mx[j], matrix[i][j]);
            }
        }
        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i <matrix.length; i++) {
            for (int j = 0; j <matrix[0].length ; j++) {
                if(mi[i]==mx[j]){
                    ans.add(mi[i]);
                }
            }
        }
        return ans;
    }

}

