package Graph;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Micgogi
 * on 4/27/2020  10:52 AM
 * Rahul Gogyani
 */
public class HEG2 {

    int v;
    LinkedList<Integer>[] list;
    int level[] ;
    public HEG2(int v){
        this.v = v;
       level = new int[v+1];
        list = new LinkedList[v+1];
        for (int i = 0; i <=v ; i++) {
            list[i] = new LinkedList<>();
        }
    }
    public void addEdge(int s, int d){
        list[s].add(d);
        list[d].add(s);
    }
    public void bfs(int s){
        Queue<Integer> q = new LinkedList<>();
        level[s]=0;
        boolean[] visited = new boolean[v+1];
        q.add(s);
        while (!q.isEmpty()){
            int n = q.peek();
            q.remove();
            if(!visited[n]){
                System.out.println(n);
                visited[n] = true;

            }
            Iterator<Integer> iterator = list[n].listIterator();
            while (iterator.hasNext()){
                int m = iterator.next();
                if(!visited[m]){
                    level[m]=level[n]+1;
                    q.add(m);
                }
            }
        }
    }
    public static void main(String[] args) {
        HEG2 graph = new HEG2(7);
        graph.addEdge(0,1);
        graph.addEdge(0,2);
        graph.addEdge(1,3);
        graph.addEdge(1,4);
        graph.addEdge(1,5);
        graph.addEdge(2,6);
        graph.addEdge(6,7);
        graph.bfs(0);
        System.out.println(Arrays.toString(graph.level));
    }
}
