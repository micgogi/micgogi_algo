package LCMarch21Challenge;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Micgogi
 * on 3/23/2021  9:37 PM
 * Rahul Gogyani
 */
public class LC923 {
    public static void main(String args[]) {
        System.out.println(threeSumMulti(new int[]{1, 1, 2, 2, 3, 3, 4, 4, 5, 5}, 8));
    }

    public static int threeSumMulti(int[] A, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        int res = 0;
        int mod = 1000000007;
        for (int i = 0; i < A.length; i++) {
            res = (res + map.getOrDefault(target - A[i], 0)) % mod;

            for (int j = 0; j < i; j++) {
                int temp = A[i] + A[j];
                map.put(temp, map.getOrDefault(temp, 0) + 1);
            }
        }
        return res;
    }


}

