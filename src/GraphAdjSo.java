import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * @author Micgogi
 * on 6/5/2021  12:42 PM
 * Rahul Gogyani
 */
public class GraphAdjSo {
     static class Graph {
        int v;
        int[][] adjmatrix;

        public Graph(int v) {
            this.v = v;
           adjmatrix= new int[v][v];

        }
        public void addEdge( int v, int w) {
            adjmatrix[v][w] = 1;
            adjmatrix[w][v] =1;
        }
    }



    public static void main(String args[]) {
        FastReader fr = new FastReader();
        int v = fr.nextInt();
        int i =0;
        int tempV =v;

        Graph graph = new Graph(v);
        HashMap<String,Integer> map = new HashMap<>();
        List<String> cities = new ArrayList<>();
        while (tempV--!=0){
            String city = fr.next();
            map.put(city,i);
            cities.add(city);
            graph.adjmatrix[i][i] =1;
            i++;
        }
        int noofPaths = fr.nextInt();
        while (noofPaths--!=0){
            String start = fr.next();
            String end = fr.next();
            int startI = map.get(start);
            int endI = map.get(end);
            graph.addEdge(startI,endI);
        }
        for (int j = 0; j <v ; j++) {
            System.out.print(cities.get(j)+" ");
        }
        System.out.println();
        for (int j = 0; j <v ; j++) {
            for (int k = -1; k <v ; k++) {
                if(k==-1) System.out.print(cities.get(j)+" ");
                else System.out.print(graph.adjmatrix[j][k]+" ");
            }
            System.out.println();
        }

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

