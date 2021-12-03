import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * @author Micgogi
 * on 12/3/2021  9:09 PM
 * Rahul Gogyani
 */
public class LC49Test {
    public static void main(String args[]) {
        System.out.println(new LC49Test().groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            char c[] = s.toCharArray();
            Arrays.sort(c);
            String temp = String.valueOf(c);
            map.putIfAbsent(temp,new ArrayList<>());
            map.get(temp).add(s);
        }


        return new ArrayList<>(map.values());
    }
}

