import java.util.HashMap;

/**
 * @author Micgogi
 * on 4/16/2020  12:23 PM
 * Rahul Gogyani
 */
public class LC169 {
    public static void main(String[] args) {
        int a[] = {2,2,1,1,1,2,2};
        int n = a.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int t:a){
            map.putIfAbsent(t,0);
            map.put(t,map.get(t)+1);
        }
        int max =0;
       for(int key:map.keySet()){
           if(map.get(key)>n/2){
               max=key;
           }
       }
        System.out.println(max);
    }
}
