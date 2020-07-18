import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * @author Micgogi
 * on 7/18/2020  1:30 PM
 * Rahul Gogyani
 */
public class LC210 {
   static HashMap<Integer, List<Integer>> adjList = new HashMap<>();

    public static void addEdge(int src, int dest){
        adjList.putIfAbsent(src,new ArrayList<>());
        List<Integer> list = adjList.get(src);
        list.add(dest);
        adjList.put(src,list);
        inDegree[dest]++;

    }
    static int[] inDegree;
    public static void main(String args[]) {
    int a[][] = {{1,0}};
    int n =2;
       inDegree = new int[n];
        for (int i = 0; i <a.length ; i++) {
            addEdge(a[i][1],a[i][0]);
        }
        System.out.println(adjList);
        Queue<Integer> queue = new LinkedList<>();
        for (int j = 0; j < n; j++) {
            if (inDegree[j] == 0) {
                queue.add(j);
            }
        }
        int t=0;
        int ans[] = new int[n];
        while (!queue.isEmpty()){
            int s = queue.poll();
            ans[t++] = s;

            if(adjList.get(s)!=null) {
                List<Integer> list = adjList.get(s);
                for (int i = 0; i <list.size() ; i++) {
                   inDegree[list.get(i)]--;
                    if(inDegree[list.get(i)]==0){
                        queue.add(list.get(i));
                    }
                }

            }




        }
        if(t==n){
            System.out.println(Arrays.toString(ans));
            return;
        }
    }





}

