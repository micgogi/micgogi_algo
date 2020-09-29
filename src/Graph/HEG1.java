package Graph;



import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;

/**
 * @author Micgogi
 * on 4/27/2020  9:57 AM
 * Rahul Gogyani
 */
public class HEG1 {
    int v;
    LinkedList<Integer>[] list;
    public HEG1(int v){
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

    public boolean check(int s, int d){
        if(s>v){
            return false;
        }

       if(list[s]!=null){
           for (int i = 0; i <list[s].size() ; i++) {
               if(list[s].get(i)==d){
                   return true;
               }

           }
       }
       return false;
    }

    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int v = Integer.parseInt(br.readLine());
            int e = Integer.parseInt(br.readLine());
            HEG1 graph = new HEG1(v);
            for (int i = 0; i <e ; i++) {
                String s[] = br.readLine().split(" ");
                int source = Integer.parseInt(s[0]);
                int dest = Integer.parseInt(s[1]);
                graph.addEdge(source,dest);
            }
            int q = Integer.parseInt(br.readLine());
            while(q--!=0){
                String s[] = br.readLine().split(" ");
                int source = Integer.parseInt(s[0]);
                int destination = Integer.parseInt(s[1]);
                if(graph.check(source,destination)){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
