import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 9/20/2020  11:33 AM
 * Rahul Gogyani
 */
public class LC389 {
    public static void main(String args[]) {
        System.out.println(findTheDifference("a", "aa"));
    }

    public static char findTheDifference(String s, String t) {
        int count[] = new int[26];
        for (int i = 0; i < t.length(); i++) {
            count[t.charAt(i)-'a']++;
        }
        for (int i = 0; i < s.length() ; i++) {
            count[s.charAt(i)-'a']--;
        }
        for (int i = 0; i <26 ; i++) {
            if(count[i]==1){
                return (char)('a'+i);
            }
        }
        return '.';
    }
}

