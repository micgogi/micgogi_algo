
import java.util.*;
import java.util.HashMap;


/**
 * @author Micgogi
 * on 5/5/2020  2:12 PM
 * Rahul Gogyani
 */
public class LC451 {
    public static void main(String[] args) {
        String s = "aaaccc";
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.putIfAbsent(c, 0);
            map.put(c, map.get(c) + 1);
        }
        List<Character> sortList = new LinkedList<>(map.keySet());
        Collections.sort(sortList,(key1,key2)->map.get(key2)-map.get(key1));
        StringBuilder sb = new StringBuilder();
        for(char key : sortList) {
            int charCount = map.get(key);
            while(charCount-- != 0) sb.append(key);
        }
        System.out.println(sb.toString());
    }
}
