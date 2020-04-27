package Graph;

import java.util.LinkedList;

/**
 * @author Micgogi
 * on 4/27/2020  12:56 PM
 * Rahul Gogyani
 */
public class HEG4 {
    int v;
    LinkedList<Integer>[] list;
    public HEG4(int v){
        this.v = v;
        list = new LinkedList[v+1];
        for (int i = 0; i <=v ; i++) {
            list[i] = new LinkedList<>();
        }
    }
    public void addEdge(int s, int d){
        list[s].add(d);
        list[d].add(s);
    }
    public void dfs(int s){
        boolean visited[] = new boolean[v+1];
        dfsUitl(s,visited);

    }
    public void dfsUitl(int s,boolean[] visited){
            if(!visited[s]){
                System.out.println(s);
                visited[s]=true;
            }
            for (int i = 0; i <list[s].size() ; i++) {
              int m = list[s].get(i);
              if(!visited[m]){
                  dfsUitl(m,visited);
              }
            }
            return;
        }

    public static void main(String[] args) {
        HEG4 graph = new HEG4(5);
        graph.addEdge(1,2);
        graph.addEdge(1,3);
        graph.addEdge(2,4);
        graph.addEdge(2,5);
        graph.dfs(1);
    }
}
