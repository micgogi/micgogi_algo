import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 7/23/2020  12:13 PM
 * Rahul Gogyani
 */
public class LC3_Pract {
    public static void main(String args[]) {
       String s = "abcabcbb";
       Map<Character, Integer> map = new HashMap<>();
       int ci=0;
       int si = 0;
       int max =0;
        for (; ci <s.length() ; ci++) {
            if(map.containsKey(s.charAt(ci))){
                si = Math.max(si, map.get(s.charAt(ci))+1);
            }
            map.put(s.charAt(ci),ci);
            max = Math.max(max,ci-si+1);
        }
        System.out.println(max);
    }



}

