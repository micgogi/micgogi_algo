import java.util.HashMap;

/**
 * @author Micgogi
 * on 4/6/2020  9:23 AM
 * Rahul Gogyani
 */
public class LC560 {
    public static void main(String[] args) {
        int a[] = {1,2,3,6,6,6};
        int k =6;
        HashMap<Integer,Integer> map = new HashMap<>();
        int res =0;
        int currSum =0;
        map.put(0,1);
        for (int i = 0; i <a.length ; i++) {
            currSum+=a[i];

            if(map.containsKey(currSum-k)){
                res+=map.get(currSum-k);
            }

                map.put(currSum,map.getOrDefault(currSum,0)+1);

        }
        System.out.println(res);
    }
}
