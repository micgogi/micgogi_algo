/*
 *@author Ragul Gogyani

 *
 * 11:31 AM 3/2/2020
 */



import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    static int v;
    static LinkedList<Integer> list[];

    public BFS(int v) {
        this.v = v;
        list = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            list[i] = new LinkedList<>();
        }
    }

    public  void bfs(int s){
        Queue<Integer> q = new LinkedList<>();
        boolean visited [] = new boolean[v];
        q.add(s);
        while(!q.isEmpty()){
           int n = q.peek();
           q.remove();
           if(!visited[n]){
               System.out.print(n+" ");
               visited[n]=true;
           }
            Iterator<Integer> iterator = list[n].iterator();
           while(iterator.hasNext()){
               int m = iterator.next();
               if(!visited[m]){
                   q.add(m);
               }
           }
        }


    }
    public  void addEdge(int s, int d) {
        list[s].add(d);
    }

    public static void main(String[] args) {
        BFS d = new BFS(4);
        d.addEdge(0,1);
        d.addEdge(0,2);
        d.addEdge(1,2);
        d.addEdge(2,0);
        d.addEdge(2,3);
        d.addEdge(3,3);
        d.bfs(2);


    }
}
