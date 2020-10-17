import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/**
 * @author Micgogi
 * on 10/17/2020  3:26 PM
 * Rahul Gogyani
 */
public class LC187 {
    public static void main(String args[]) {
        String s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
        System.out.println(findRepeatedDnaSequences(s));
    }
    public static List<String> findRepeatedDnaSequences(String s) {
        int start = 0;
        int end = 10;
        Set<String> set = new HashSet<>();
        Set<String> rep = new HashSet<>();
        while (end <= s.length()){
            String t = s.substring(start, end);
            if(set.contains(t)){
                rep.add(t);
            }
            set.add(t);
            start++;
            end++;
        }
        return new ArrayList<>(rep);
    }
}

