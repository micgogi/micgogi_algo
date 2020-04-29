import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @author Micgogi
 * on 4/29/2020  10:27 AM
 * Rahul Gogyani
 */
public class HEG6 {
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
    HEG6(int v, int e){
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
    Edge result[];
    void kruskal(){
      result = new Edge[v+1];
        int e = 0;
        int i =0;
        for (int j = 0; j <=v ; j++) {
            result[j] = new Edge();
        }
        Arrays.sort(edge);
        Subset subset[] = new Subset[v+1];
        for (int j = 0; j <=v ; j++) {
            subset[j] = new Subset();
        }
        for (int j = 0; j <=v ; j++) {
            subset[j].parent = j;
            subset[j].rank = 0;

        }
        while(e<v-1){

        Edge nextEdge = edge[i++];
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




      try{
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          String s1[] = br.readLine().split(" ");
          int v = Integer.parseInt(s1[0]);
          int e = Integer.parseInt(s1[1]);
          HEG6 graph = new HEG6(v,e);
          for (int i = 0; i <e ; i++) {
              String s2[] = br.readLine().split(" ");
              graph.edge[i].src= Integer.parseInt(s2[0]);
              graph.edge[i].dest = Integer.parseInt(s2[1]);
              graph.edge[i].weight = Integer.parseInt(s2[2]);
          }
          graph.kruskal();
          int sum =0;
          for (int i = 0; i <graph.result.length ; i++) {
              sum+=graph.result[i].weight;
          }
          System.out.println(sum);
      }catch (Exception e){
        e.printStackTrace();
      }

    }
}
