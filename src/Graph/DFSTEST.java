import java.util.Iterator;
import java.util.LinkedList;
/*
 *@author Rahul Gogyani

 *
 * 10:36 AM 3/2/2020
 */

public class DFSTEST {
 static int v;
   static LinkedList<Integer> list[];
    public DFSTEST(int v){
        this.v = v;
        list = new LinkedList[v];
        for (int i = 0; i <v ; i++) {
            list[i] = new LinkedList();
        }
    }
    public static void main(String[] args) {
        DFSTEST d = new DFSTEST(4);
        d.addEdge(0,1);
        d.addEdge(0,2);
        d.addEdge(1,2);
        d.addEdge(2,0);
        d.addEdge(2,3);
        d.addEdge(3,3);
        dfs(2);

    }
    public static void dfs(int s){
        boolean visited[] = new boolean[v];
        dfsUtil(2,visited);

    }

    public static void dfsUtil(int s, boolean[] viisted){
        viisted[s]=true;
        System.out.print(s+" ");
        Iterator<Integer> iterator = list[s].iterator();
        while(iterator.hasNext()){
            int m = iterator.next();
            if(!viisted[m]){
               dfsUtil(m,viisted);
            }

        }
    }
    public  void addEdge(int v, int w){
        list[v].add(w);
    }
}
