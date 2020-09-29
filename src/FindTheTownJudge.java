
import java.util.*;

/**
 * @author Micgogi
 * on 5/10/2020  2:18 PM
 * Rahul Gogyani
 */
public class FindTheTownJudge {
    public static void main(String[] args) {
        int trust[][] = {{1, 3},{1,4},{2,3},{2,4},{4,3}};
        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        int n =4;
        
        int parents[] = new int[n+1];
        for (int i = 1; i <=n ; i++) {
            parents[i]=i;
        }

        for (int i = 0; i <trust.length ; i++) {
            int c = trust[i][0];
            int d = trust[i][1];
            parents[c]=d;
            map.computeIfAbsent(d,val->new ArrayList<>()).add(c);

        }

        Iterator iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry e = (Map.Entry) iterator.next();
            ArrayList<Integer> list = (ArrayList<Integer>) e.getValue();
            if(list.size()==n-1){
                int key = (int) e.getKey();
                if(parents[key]!=key){
                    System.out.println(-1);
                    return;
                }
                System.out.println((int)e.getKey());
                return;

            }
        }
        System.out.println(-1);

    }
}
