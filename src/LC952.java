import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 8/30/2020  5:53 PM
 * Rahul Gogyani
 */
public class LC952 {
    class UnionFind {
        int[] parent;
        int[] size;
        int max;

        public UnionFind(int n) {
            parent = new int[n];
            size = new int[n];
            max = 1;
            for (int i = 0; i < n; i++) {
                parent[i] = i;
                size[i] = 1;
            }
        }

        public int find(int x) {
            if (x == parent[x]) {
                return x;
            }
            return parent[x] = find(parent[x]);
        }

        public void union(int x, int y) {
            int rootX = find(x);
            int rootY = find(y);
            if (rootX != rootY) {
                parent[rootX] = rootY;
                size[rootY] += size[rootX];
                max = Math.max(max, size[rootY]);
            }
        }
    }

    public int largestComponentSize(int[] A) {
        int n = A.length;
        Map<Integer, Integer> map = new HashMap<>();
        UnionFind unionFind = new UnionFind(n);
        for (int i = 0; i < n; i++) {
            int a = A[i];
            for (int j = 2; j * j <= a; j++) {
                if (a % j == 0) {
                    if (!map.containsKey(j)) {
                        map.put(j, i);
                    } else {
                        unionFind.union(i, map.get(j));
                    }
                    if (!map.containsKey(a / j)) {
                        map.put(a / j, i);
                    } else {
                        unionFind.union(i, map.get(a/j));
                    }
                }

            }
            if(!map.containsKey(a)){
                map.put(a,i);
            }else{
                unionFind.union(i,map.get(a));
            }
        }
        return unionFind.max;
    }

    public static void main(String args[]) {
        FastReader sc = new FastReader();
        LC952 lc952 = new LC952();

        int a[] = {65,78,75,73,84,65};
        System.out.println(lc952.largestComponentSize(a));
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

