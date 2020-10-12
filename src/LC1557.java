import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 10/12/2020  4:49 PM
 * Rahul Gogyani
 */
public class LC1557 {
    public static void main(String args[]) {
        int n = 6;
        int[][] edges = {{0, 1}, {2, 1}, {3, 1}, {1, 4}, {2, 4}};
        int[] seen = new int[n];
        for (int[] edge: edges){
            seen[edge[1]] = 1;
        }
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < n ; i++) {
            if(seen[i]==0)ans.add(i);
        }
        System.out.println(ans);
    }

}

