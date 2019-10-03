import java.util.Iterator;
import java.util.LinkedList;

public class Graph1 {
    int v;
    LinkedList adj[];
    public Graph1(int v){
        this.v = v;
        adj =new LinkedList[v];
        for(int i=0;i<v;i++){
            adj[i]=new LinkedList();
        }
    }
    public void addEdge(int v, int w){
        adj[v].add(w);
    }
    public void dfsUtil(int s, boolean visited[] ){
        visited[s]=true;
        System.out.println(s+" ");
        Iterator<Integer> iterator = adj[s].listIterator();
        while(iterator.hasNext()){
            int n = iterator.next();
            if(!visited[n]){
                visited[n]=true;
                dfsUtil(n,visited);
            }

        }

    }
    public void Dfs(int s){
        boolean visited [] = new boolean[v];
        dfsUtil( s, visited);
    }
    public static  void main(String args[]){
        Graph1 g = new Graph1(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
       g.Dfs(2);
    }
}
