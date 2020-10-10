import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 10/10/2020  3:48 PM
 * Rahul Gogyani
 */
public class SG4 {
   static class Graph {
        int v;
        LinkedList<Integer> adjList[];

        public Graph(int v) {
            this.v = v;
            adjList = new LinkedList[v + 1];
            for (int i = 1; i < adjList.length; i++) {
                adjList[i] = new LinkedList<>();
            }
        }
        public  void addEdge(Graph g, int v, int w) {
            g.adjList[v].add(w);
        }

    }

        public static void main(String args[]) {
            FastReader sc = new FastReader();
            int t = sc.nextInt();
            while (t--!=0){
                int v = sc.nextInt();
                Graph g = new Graph(v);
                for (int i = 1; i <=v-1; i++) {
                    int src = sc.nextInt();
                    int dest = sc.nextInt();
                    g.addEdge(g,src,dest);
                }
                int count[] = new int[v+1];

                for (int i = 1; i <=v ; i++) {
                    countedge(count, g.adjList,i,i);
                }

                for (int i = 1; i <count.length ; i++) {
                    System.out.println(count[1]+" ");
                }
                System.out.println();
            }

        }

        public static void countedge(int count[],LinkedList<Integer> adjList[], int v, int index){
            LinkedList<Integer> ele = adjList[index];

            for (int i : ele){
                countedge(count,adjList,v,i);
                count[v]++;

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

