/*
 *@author Ragul Gogyani

 *
 * 11:18 AM 3/2/2020
 */

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class DFSITER {
   static int v;
    static LinkedList<Integer> list[];
    public DFSITER(int v){
        this.v = v;
        list = new LinkedList[v];
        for (int i = 0; i <v ; i++) {
            list[i] = new LinkedList<>();
        }
    }
    public  void addEdge(int s, int d){
        list[s].add(d);
    }
    public void dfs(int s){
        boolean visited[] = new boolean[v];
        Stack<Integer> stack = new Stack<>();
      stack.push(s);

        while(!stack.isEmpty()){
           int n = stack.pop();
           if(!visited[n]){
               visited[n]=true;
               System.out.print(n+"");
           }
            Iterator<Integer> iterator = list[n].iterator();
           while(iterator.hasNext()){
               int m = iterator.next();
               if(!visited[m]){
                   stack.push(m);
               }
           }

        }
    }
    public static void main(String[] args) {
        DFSITER d = new DFSITER(4);
        d.addEdge(0,1);
        d.addEdge(0,2);
        d.addEdge(1,2);
        d.addEdge(2,0);
        d.addEdge(2,3);
        d.addEdge(3,3);
        d.dfs(2);


    }
}
