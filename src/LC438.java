/*
 *@author Rahul Gogyani
 *
 * 10:51 AM 2/14/2020
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LC438 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String s = br.readLine();
            String p = br.readLine();
            HashMap<Character, Integer> map = new HashMap<>();
            List<Integer> list = new ArrayList<>();
            if (s.length() < p.length() || s.length() == 0) {
                System.out.println(s);
            }
            for (Character c : p.toCharArray()) {
                if (!map.containsKey(c)) {
                    map.put(c, 1);
                } else {
                    map.put(c, map.get(c) + 1);
                }
            }
            int e = 0, b = 0, count = map.size(), word = p.length();
            while (e < s.length()) {
                char c = s.charAt(e);
                if (map.containsKey(c)) {
                    map.put(c, map.get(c) - 1);
                    if (map.get(c) == 0) count--;
                }

                e++;
                while (count == 0) {
                    if (e - b == word) {
                        list.add(b);
                    }
                    char bc = s.charAt(b);

                    if (map.containsKey(bc)) {
                        map.put(bc, map.get(bc) + 1);
                        if (map.get(bc) > 0) count++;
                    }
                    b++;
                }

            }
            System.out.println(list);
        }catch (Exception e){
            
        }
    }
}
