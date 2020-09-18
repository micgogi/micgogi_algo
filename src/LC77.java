import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 9/18/2020  11:13 AM
 * Rahul Gogyani
 */
public class LC77 {
    public static void main(String[] args) {
        int n = 4;
        int k = 2;
        List<List<Integer>> ans = new ArrayList<>();
        backTrack(1, n, new ArrayList<>(), ans, k);
        System.out.println(ans);

    }

    public static void backTrack(int start, int n, List<Integer> tempList, List<List<Integer>> ans, int k) {
        if (k == 0) {
            ans.add(new ArrayList<>(tempList));
            return;
        }
        for (int i = start; i <= n; i++) {
            tempList.add(i);
            backTrack(i + 1, n, tempList, ans, k - 1);
            tempList.remove(tempList.size() - 1);
        }
    }
}

