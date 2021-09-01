package LCMarch21Challenge;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Micgogi
 * on 3/12/2021  1:39 PM
 * Rahul Gogyani
 */
public class LC1461 {
    public static void main(String args[]) {
        System.out.println(hasAllCodes("00110110", 2));
    }

    public static boolean hasAllCodes(String s, int k) {
        int total = 1 << k;

        Set<String> set = new HashSet<>();
        for (int i = k; i <= s.length(); i++) {
            String temp = s.substring(i - k, i);
            if (!set.contains(temp)) {
                set.add(temp);
                total--;
                if (total == 0) return true;
            }
        }
        return false;
    }

}

