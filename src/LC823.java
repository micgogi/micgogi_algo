import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Micgogi
 * on 3/13/2021  4:34 PM
 * Rahul Gogyani
 */
public class LC823 {
    public static void main(String args[]) {
        System.out.println(numFactBinaryTree(new int[]{2, 4, 5, 10}));
    }

    public static int numFactBinaryTree(int a[]) {
        Arrays.sort(a);
        Map<Integer, Long> map = new HashMap<>();
        long count = 1;
        int mod = 1_000_000_007;
        map.put(a[0], 1L);
        for (int i = 1; i < a.length; i++) {
            count = 1;
            for (Integer n : map.keySet()) {
                if (a[i] % n == 0 && map.containsKey(a[i] / n)) {
                    count += map.get(n) * map.get(a[i] / n);
                }
            }
            map.put(a[i], count);
        }
        System.out.println(map);
        long sum = 0;
        for (Integer n : map.keySet()) {
            sum = (sum + map.get(n)) % mod;
        }
        return (int) sum;
    }
}

