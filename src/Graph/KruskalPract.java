package Graph;

import java.util.Arrays;

/**
 * @author Micgogi
 * on 4/28/2020  4:15 PM
 * Rahul Gogyani
 */
public class KruskalPract {
    class Edge implements Comparable<Edge>{
        int src, dest, weight;

        @Override
        public int compareTo(Edge o) {
            return this.weight-o.weight;
        }
    }
    class Subset{
        int parent, rank;
    }
    int v, e;
    Edge edge[];
    KruskalPract(int v, int e){
        this.v = v;
        this.e = e;
        edge = new Edge[e];
        for (int i = 0; i <e ; i++) {
            edge[i] = new Edge();
        }
    }
        int find(Subset subset[], int i){
        if(subset[i].parent!=i){
            subset[i].parent = find(subset,subset[i].parent);
        }
        return subset[i].parent;
        }

        void union(Subset subset[], int x, int y){
        int xparent = find(subset,x);
        int yparent = find(subset,y);
        if(subset[xparent].rank<subset[yparent].rank){
            subset[xparent].parent = yparent;
        }else if(subset[xparent].rank>subset[yparent].rank){
            subset[yparent].parent = xparent;
        }else{
            subset[yparent].parent = xparent;
            subset[xparent].rank++;
        }
        }

        void kruskal(){
        Edge result[] = new Edge[v];
        int e = 0;
        int i =0;
            for (int j = 0; j <v ; j++) {
             result[j] = new Edge();
            }
            Arrays.sort(edge);
            Subset subset[] = new Subset[v];
            for (int j = 0; j <v ; j++) {
                subset[j] = new Subset();
            }
            for (int j = 0; j <v ; j++) {
                subset[j].parent = j;
                subset[j].rank = 0;

            }
            while(e<v-1){

              Edge  nextEdge = edge[i++];
                int x = find(subset, nextEdge.src);
                int y = find(subset, nextEdge.dest);
                if(x!=y){
                    result[e++]= nextEdge;
                    union(subset,x,y);
                }
            }
            for (int j = 0; j <e ; j++) {
                System.out.println(result[j].src+"----"+result[j].dest+"---"+result[j].weight);
            }
        }
    public static void main(String[] args) {
        int V = 4;  // Number of vertices in graph
        int E = 5;  // Number of edges in graph
        KruskalPract graph = new KruskalPract(V,E);


        graph.edge[0].src = 0;
        graph.edge[0].dest = 1;
        graph.edge[0].weight = 10;


        graph.edge[1].src = 0;
        graph.edge[1].dest = 2;
        graph.edge[1].weight = 6;


        graph.edge[2].src = 0;
        graph.edge[2].dest = 3;
        graph.edge[2].weight = 5;

        graph.edge[3].src = 1;
        graph.edge[3].dest = 3;
        graph.edge[3].weight = 15;


        graph.edge[4].src = 2;
        graph.edge[4].dest = 3;
        graph.edge[4].weight = 4;
        graph.kruskal();
    }
}
