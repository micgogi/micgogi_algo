package Graph;

import java.util.*;

/**
 * @author Micgogi
 * on 3/16/2020  7:25 AM
 * Rahul Gogyani
 */
public class DijsktraShortestPathUsingAdjacencyList {
    private static final double EPS = 1e-6;
    public static class Edge{
        double cost;
        int from,to;
        public Edge(int form, int to, double cos){
            this.from = from;
            this.to = to;
            this.cost = cost;
        }

    }
    public  static  class Node{
        int id;
        double value;
        public Node(int id, double value){
            this.id = id;
            this.value = value;
        }
    }
    private  int n ;
    private  double[] dist;
    private Integer[] prev;
    private List<List<Edge>> graph;
    private Comparator<Node> comparator = new Comparator<Node>() {
        @Override
        public int compare(Node o1, Node o2) {
           if(Math.abs(o1.value-o2.value)<EPS)return 0;
           return (o1.value-o2.value)>0?1:-1;
        }
    };

    public DijsktraShortestPathUsingAdjacencyList(int n){
        this.n = n;
        createEmptyGraph();
    }
    private void createEmptyGraph(){
        graph = new ArrayList<>(n);
        for (int i = 0; i <n ; i++) {
            graph.add(new ArrayList<>());
            
        }
    }
    public DijsktraShortestPathUsingAdjacencyList(int n , Comparator<Node> comparator){
        this(n);
        if(comparator==null)throw  new IllegalArgumentException("Comparator can not be null");
        this.comparator = comparator;

    }
    public void addEdge(int from, int to, int cost){
        graph.get(from).add(new Edge(from,to,cost));
    }
    public List<List<Edge>> getGraph(){
        return graph;
    }

    public  double dijkstra(int start, int end){
        dist = new double[n];
        Arrays.fill(dist, Double.POSITIVE_INFINITY);
        dist[start] =0;
        PriorityQueue<Node> pq = new PriorityQueue<>(2*n, comparator);
        pq.offer(new Node(start,0));
        boolean[] visited = new boolean[n];
        prev = new Integer[n];
        while (!pq.isEmpty()){
            Node n = pq.poll();
            visited[n.id] = true;
            if(dist[n.id]<n.value)continue;
            List<Edge> edges = graph.get(n.id);
            for (int i = 0; i < edges.size(); i++) {
                Edge edge = edges.get(i);
                if(visited[edge.to])continue;


                double newDist = dist[edge.from]+edge.cost;
                if(newDist< dist[edge.to]){
                    prev[edge.to] = edge.from;
                    dist[edge.to] = newDist;
                    pq.offer(new Node(edge.to,edge.from));

                }
            }
            if(n.id==end) return dist[end];

        }
        return Double.POSITIVE_INFINITY;

    }
    public static void main(String[] args) {

    }
}
