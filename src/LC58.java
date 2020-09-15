import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 9/15/2020  3:08 PM
 * Rahul Gogyani
 */
public class LC58 {
    public static void main(String args[]) {
        System.out.println(lengthOfLastWord("Hello WORLD!"));
    }

    public static int lengthOfLastWord(String s) {
        s = s.trim();
        if (s.length() == 0) return 0;
        String s1[] = s.split(" ");
        return s1[s1.length - 1].length();
    }
}

