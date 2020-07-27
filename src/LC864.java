import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 7/27/2020  5:28 PM
 * Rahul Gogyani
 */
public class LC864 {
    static int res[], count[];
    static LinkedList<Integer> adjList[];

    public static void main(String args[]) {
        FastReader sc = new FastReader();
        int N = 6;
        int edges[][] = {{0, 1}, {0, 2}, {2, 3}, {2, 4}, {2, 5}};
        adjList = new LinkedList[N];
        for (int i = 0; i < N; i++) {
            adjList[i] = new LinkedList<>();
        }
        for (int[] edge : edges) {
            addEdge(edge[0], edge[1]);
        }

        System.out.println(Arrays.toString(adjList));

        res = new int[N];
        count = new int[N];
        dfs(0,-1);
        System.out.println(Arrays.toString(count));
        System.out.println(Arrays.toString(res));
        dfs2(0,-1);
        System.out.println(Arrays.toString(count));
        System.out.println(Arrays.toString(res));
    }


    public static void dfs(int root, int pre) {
        for (int i : adjList[root]) {
            if (i == pre) continue;
            dfs(i, root);
            count[root]+=count[i];
            res[root]+=res[i]+count[i];

        }
        count[root]++;
    }
    public static void dfs2(int root,int pre){
        for(int i:adjList[root]){
            if(i==pre)continue;
            res[i] = res[root]-count[i]+count.length-count[i];
            System.out.println(res[i]);
            dfs2(i,root);
        }
    }


    public static void addEdge(int src, int dest) {
        adjList[src].add(dest);
        adjList[dest].add(src);
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in), 32768);
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

}

