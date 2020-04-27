package Graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Micgogi
 * on 4/27/2020  11:07 AM
 * Rahul Gogyani
 */
public class HEG3 {
    LinkedList<Integer> list[];
    int[] level;
    int v;
    int count=0;
    public HEG3(int v){
        this.v = v;
        list = new LinkedList[v+1];
        level = new int[v+1];
        for (int i = 0; i <=v ; i++) {
            list[i]= new LinkedList<Integer>();
        }
    }

    public void addEdge(int s, int d){
        list[s].add(d);
        list[d].add(s);
    }

   public void bfs(int s, int node){
       Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[v+1];
        queue.add(s);
        level[s]=1;
        while (!queue.isEmpty()){
            int n = queue.peek();
            queue.poll();
            if(!visited[n]){
                visited[n]=true;
            }
            Iterator<Integer> iterator = list[n].listIterator();
            while(iterator.hasNext()){
                int m = iterator.next();
                if(!visited[m]){
                    queue.add(m);
                    level[m]=level[n]+1;
                    if(level[m]==node){
                        count++;
                    }
                    visited[m]=true;
                }
            }
        }
   }

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int v = Integer.parseInt(br.readLine());
        HEG3 graph = new HEG3(v);
        for (int i = 0; i <v-1 ; i++) {
            String s[] = br.readLine().split(" ");
            int src = Integer.parseInt(s[0]);
            int dest = Integer.parseInt(s[1]);
            graph.addEdge(src,dest);
        }
        int n = Integer.parseInt(br.readLine());
        graph.bfs(1,n);
        System.out.println(graph.count);
    }
}
