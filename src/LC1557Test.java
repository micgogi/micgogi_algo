import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 11/21/2021  11:50 AM
 * Rahul Gogyani
 */
public class LC1557Test {
    public static void main(String[] args) {

    }

    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        boolean incomingEdge[] = new boolean[n];
        for (List<Integer> edge : edges) {
            incomingEdge[edge.get(1)] = true;

        }
        List<Integer> ans = new ArrayList<Integer>();
        for (int i = 0; i < incomingEdge.length; i++) {
            if (!incomingEdge[i]) ans.add(i);
        }
        return ans;
    }
}

