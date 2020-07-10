import java.util.*;

/**
 * @author Micgogi
 * on 7/10/2020  7:04 PM
 * Rahul Gogyani
 */
public class LC349 {

    public static void main(String[] args) {
        int a[] = {1,2,2,1};
        int b[] = {2,2};
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i <a.length ; i++) {
            map.putIfAbsent(a[i],0);
            map.put(a[i],map.get(a[i])+1);
        }
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i <b.length ; i++) {
            map.getOrDefault(b[i],0);
            if(map.get(b[i])>0){
                set.add(b[i]);


            }
        }
        System.out.println(list);
    }
}
