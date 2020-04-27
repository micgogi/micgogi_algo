package Graph;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;

/**
 * @author Micgogi
 * on 4/27/2020  2:56 PM
 * Rahul Gogyani
 */
public class HEG5 {
    int v;
    LinkedList<Integer> list[];
    public HEG5(int v){
        this.v = v;
        list = new LinkedList[v+1];
        for (int i = 0; i <=v ; i++) {
            list[i]= new LinkedList<>();
        }
    }
    public void addEdge(int s, int d){
        list[s].add(d);
        list[d].add(s);
    }

    boolean visited[];
    public void dfs(int s){
       visited= new boolean[v+1];
        dfsUtil( s, visited);

    }
    public void dfsUtil(int s, boolean[] visited){
      if(!visited[s]){
          visited[s]=true;
      }
        for (int i = 0; i <list[s].size() ; i++) {
            int m = list[s].get(i);
            if(!visited[m]){
                dfsUtil(m,visited);
            }
        }
        return;

    }
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");
        int v = Integer.parseInt(s[0]);
        int e = Integer.parseInt(s[1]);
        HEG5 graph =new HEG5(v);
        for (int i = 0; i <e ; i++) {
            String s1[] = br.readLine().split(" ");
            int src = Integer.parseInt(s1[0]);
            int dest = Integer.parseInt(s1[1]);
            graph.addEdge(src,dest);
        }
        int n = Integer.parseInt(br.readLine());
        graph.dfs(n);
        int count=0;
        for (int i = 1; i <graph.visited.length ; i++) {
            if(!graph.visited[i])count++;
        }
        System.out.println(count);
    }
}
