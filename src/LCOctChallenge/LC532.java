package LCOctChallenge;

import java.util.HashMap;

/**
 * @author Micgogi
 * on 10/3/2020  1:06 PM
 * Rahul Gogyani
 */
public class LC532 {
    public static void main(String args[]) {
        int a[] = {1, 3, 1, 5, 4};

        int k = 0;
        System.out.println(findPairs(a, k));
    }

    public static int findPairs(int[] nums, int k) {
        HashMap<Integer, Integer> counter = new HashMap<>();
        for (int num : nums) {
            counter.put(num, counter.getOrDefault(num, 0) + 1);
        }
        int count = 0;
        for (int key : counter.keySet()) {
            if (k == 0) {
                if (counter.get(key) >= 2) count++;
            } else {
                if (counter.containsKey(key + k)) {
                    count++;
                }
            }
        }
        return count;

    }
}

