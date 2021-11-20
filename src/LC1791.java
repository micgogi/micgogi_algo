import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 11/20/2021  10:16 PM
 * Rahul Gogyani
 */
public class LC1791 {
    public static void main(String args[]) {
        int[][] edges = {{1,2},{1,3},{1,4}};
        System.out.println(new LC1791().findCenter(edges));

    }

    public int findCenter(int[][] edges) {

        for (int i = 1; i <edges.length ; i++) {
            if(edges[i-1][0]==edges[i][0])return edges[i-1][0];
            else if(edges[i-1][0]==edges[i][1])return edges[i-1][0];
            else if(edges[i-1][1]==edges[i][0])return edges[i][0];
            else return edges[i][1];
        }
        return 0;
    }
}

