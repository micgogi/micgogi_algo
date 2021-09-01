package august21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 8/15/2021  1:04 PM
 * Rahul Gogyani
 */
public class LC76 {
    public static void main(String args[]) {
        System.out.println(minWindow("ADOBECODEBANC", "ABC"));
    }

    public static String minWindow(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (Character c : t.toCharArray()) {
            if (!map.containsKey(c)) {
                map.put(c, 1);
            } else {
                map.put(c, map.get(c) + 1);
            }
        }
        int b = 0, e = 0;
        int count = map.size();
        String res = "";
        int len = Integer.MAX_VALUE;
        while (e < s.length()) {
            char c = s.charAt(e);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) - 1);
                if (map.get(c) == 0) {
                    count--;

                }
            }
            e++;
            while (count == 0) {
                if (e - b < len) {
                    len = e - b;
                    res = s.substring(b, e);
                }

                char bc = s.charAt(b);
                if (map.containsKey(bc)) {
                    map.put(bc, map.get(bc) + 1);
                    if (map.get(bc) > 0) count++;
                }

                b++;
            }
        }
        return res;

    }
}

