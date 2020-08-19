import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;
import java.util.Stack;

/**
 * @author Micgogi
 * on 8/19/2020  4:30 PM
 * Rahul Gogyani
 */
public class E1391 {
    private static PrintWriter pr = new PrintWriter(System.out);
    private static ArrayList<ArrayList<Integer>> graph;
    private static ArrayList<ArrayDeque<Integer>> levelList;
    private static boolean[] visited;
    private static int limit;
    private static Stack<Integer> stack;

    static class Pair {
        int first;
        int second;

        public Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }

    public static void main(String args[]) {
        FastReader sc = new FastReader();
        int t = sc.nextInt();
        while (t-- != 0) {
            int nodes = sc.nextInt();
            int edges = sc.nextInt();
            graph = new ArrayList<>();
            for (int i = 0; i < nodes; i++) {
                graph.add(new ArrayList<>());
            }
            levelList = new ArrayList<>();
            visited = new boolean[nodes];
            stack = new Stack<>();
            limit = (nodes + 1) / 2;
            while (edges-- != 0) {
                int src = sc.nextInt() - 1;
                int dest = sc.nextInt() - 1;
                graph.get(src).add(dest);
                graph.get(dest).add(src);
            }
            if (!dfs(0, 0)) {
                List<Pair> ans = new ArrayList<>();
                for (int i = 0; i < levelList.size(); i++) {
                    Deque<Integer> curr = levelList.get(i);
                    while (curr.size() > 1) {
                        ans.add(new Pair(curr.pollFirst(), curr.pollFirst()));
                    }
                }
                pr.println("PAIRING");
                pr.println(ans.size());
                for (Pair pair : ans) {
                    pr.println((pair.first + 1) + " " + (pair.second + 1));
                }
            }

        }
        pr.flush();
        pr.close();


    }

    private static boolean dfs(int node, int level) {
        stack.push(node);
        visited[node] = true;
        if (level == levelList.size()) {
            levelList.add(new ArrayDeque<>());
        }
        levelList.get(level).addLast(node);
        if (stack.size() == limit) {
            pr.println("PATH");
            pr.println(stack.size());
            while (!stack.isEmpty()) {
               pr.print((stack.pop() + 1) + " ");
            }
           pr.println();
            return true;
        }
        for (Integer child : graph.get(node)) {
            if (!visited[child]) {
                if (dfs(child, level + 1))
                    return true;
            }
        }
        stack.pop();
        return false;


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

        int[] readArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = nextInt();
            return a;
        }

        int[][] read2DArray(int n) {
            int[][] a = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    a[i][j] = nextInt();
                }
            }
            return a;
        }

        int[][] read2DArray(int n, int m) {
            int[][] a = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    a[i][j] = nextInt();
                }
            }
            return a;
        }
    }

}

