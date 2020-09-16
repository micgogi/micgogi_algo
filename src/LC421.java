import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 9/16/2020  5:18 PM
 * Rahul Gogyani
 */
public class LC421 {
    public static void main(String args[]) {
        int nums[] = {25, 10, 2, 8, 5, 3};
        int max = 0;
        int mask = 0;
        for (int i = 31; i >= 0; i--) {
            mask = mask | (1 << i);
            Set<Integer> set = new HashSet<>();
            for (int num : nums) {
                set.add(num & mask);
            }
            int newMask = max | (1 << i);
            for (int prefix : set) {
                if (set.contains(newMask ^ prefix)) {
                    max = newMask;
                    break;
                }
            }
        }
        System.out.println(max);
    }


}

