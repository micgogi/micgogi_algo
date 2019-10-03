import java.util.Iterator;
import java.util.LinkedList;

public class Graph {
    int v;
    LinkedList adj[];
    public Graph(int v){
        this.v = v;
        adj =new LinkedList[v];
        for(int i=0;i<v;i++){
            adj[i]=new LinkedList();
        }
    }
    public void addEdge(int v, int w){
        adj[v].add(w);
    }
    public void BFS(int s){
        boolean visited[] = new boolean[v];
        LinkedList<Integer> queue = new LinkedList<>();
        queue.add(s);
        visited[s]=true;

        while(queue.size()!=0){
            s= queue.poll();
            System.out.println(s+" ");
            Iterator<Integer> iterator = adj[s].listIterator();
            while(iterator.hasNext()){
                int n = iterator.next();
                if(!visited[n]) {
                    queue.add(n);
                    visited[n] = true;
                }
            }



        }
    }
    public static void main(String args[]){
        Graph g = new Graph(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
        g.BFS(2);

    }
}
