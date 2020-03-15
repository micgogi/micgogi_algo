package Graph;

import java.util.Arrays;

/**
 * @author Micgogi
 * on 3/15/2020  8:30 AM
 * Rahul Gogyani
 */
public class BellmanFordUsingAdjacencyMatrix {
    private int n, start;
    private boolean solved;
    private double[] dist;

    private double[][] matrix;

    public BellmanFordUsingAdjacencyMatrix(int start, double matrix[][]) {
        this.n = matrix.length;
        this.start = start;
        this.matrix = new double[n][n];
        for (int i = 0; i < n; i++) {
            this.matrix[i] = matrix[i].clone();

        }
    }

    public double[] getShortestPath() {
        if (!solved) solve();
        return dist;
    }

    private void solve() {
        if (solved) return;
        dist = new double[n];
        Arrays.fill(dist, Double.POSITIVE_INFINITY);
        dist[start] = 0;
        for (int k = 0; k < n - 1; k++)
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++)
                    if (dist[i] + matrix[i][j] < dist[j]) {
                        dist[j] = dist[i] + matrix[i][j];

                    }

        for (int k = 0; k < n - 1; k++)
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++)
                    if (dist[i] + matrix[i][j] < dist[j]) {
                        dist[j] = Double.NEGATIVE_INFINITY;

                    }

        solved = true;


    }

    public static void main(String[] args) {
        int n = 9;
        double[][] graph = new double[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(graph[i], Double.POSITIVE_INFINITY);
            graph[i][i] = 0;
        }

        graph[0][1] = 1;
        graph[1][2] = 1;
        graph[2][4] = 1;
        graph[4][3] = -3;
        graph[3][2] = 1;
        graph[1][5] = 4;
        graph[1][6] = 4;
        graph[5][6] = 5;
        graph[6][7] = 4;
        graph[5][7] = 3;
        int start = 0;
        BellmanFordUsingAdjacencyMatrix solver = new BellmanFordUsingAdjacencyMatrix(start,graph);
        double[] d = solver.getShortestPath();
        for (int i = 0; i <n ; i++) {
            System.out.println(start+"-->"+i+" "+d[i]);
            
        }
    }
}
