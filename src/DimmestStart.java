import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/**
 * @author Micgogi
 * on 4/26/2020  4:33 PM
 * Rahul Gogyani
 */
public class DimmestStart {
    int v;
     LinkedList<Integer> list[];
    public DimmestStart(int v){
        this.v = v;
        list = new LinkedList[v+1];
        for (int i = 0; i <=v; i++) {
            list[i] = new LinkedList<>();
        }
    }
    static List<Integer> list1 = new ArrayList<>();
    public void addEdge(int s, int d) {
        list[s].add(d);
    }

    public  void bfs(int s){
        Queue<Integer> q = new LinkedList<>();
        boolean visited [] = new boolean[v+1];
        q.add(s);
        while(!q.isEmpty()){
            int n = q.peek();
            q.remove();
            if(!visited[n]){
               list1.add(n);
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
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int v = Integer.parseInt(br.readLine());
            DimmestStart ds = new DimmestStart(v);
            for (int i = 0; i <v-1 ; i++) {
                String s[] = br.readLine().split(" ");
                ds.addEdge(Integer.parseInt(s[0]),Integer.parseInt(s[1]));

            }
            int root = Integer.parseInt(br.readLine());
            ds.bfs(root);
            System.out.println(list1.get(list1.size()-1));


        }catch (Exception e){
            e.printStackTrace();

        }
    }

}
