import java.util.*;

/**
 * @author Micgogi
 * on 7/10/2020  7:24 PM
 * Rahul Gogyani
 */
public class Lc350 {

    public static void main(String[] args) {
        int a[] = {1,2,2,1};
        int b[] = {2,2};
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i <a.length ; i++) {
            map.putIfAbsent(a[i],0);
            map.put(a[i],map.get(a[i])+1);
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <b.length ; i++) {
            map.getOrDefault(b[i],0);
            if(map.get(b[i])>0){
                list.add(b[i]);
                map.put(b[i],map.get(b[i])-1);

            }
        }
        System.out.println(list);
    }
}
