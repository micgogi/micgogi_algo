package august21;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @author Micgogi
 * on 8/11/2021  4:46 PM
 * Rahul Gogyani
 */
public class LC954 {
    public static void main(String args[]) {
        System.out.println(canReorderDoubled(new int[]{-2, 4, 2, -4}));
    }

    public static boolean canReorderDoubled(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Integer b[] = new Integer[arr.length];
        int i = 0;
        for (int a : arr) {
            map.put(a, map.getOrDefault(a, 0) + 1);
            b[i++] = a;
        }
        Arrays.sort(b, (c, d) -> Math.abs(c) - Math.abs(d));
        for (int c : b) {
            if (map.get(c) == 0) continue;
            if (map.getOrDefault(2 * c, 0) <= 0) return false;
            map.put(c, map.get(c) - 1);
            map.put(2 * c, map.get(2 * c) - 1);
        }
        return true;
    }

}

