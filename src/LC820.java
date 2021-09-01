import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Micgogi
 * on 3/6/2021  4:02 PM
 * Rahul Gogyani
 */
public class LC820 {
    public static void main(String args[]) {
        System.out.println(minimumLengthEncoding(new String[]{"time", "me", "bell"}));
    }

    public static int minimumLengthEncoding(String[] words) {
        Set<String> set = new HashSet<>(Arrays.asList(words));
        System.out.println(set);
        for (String s : words) {
            for (int i = 1; i < s.length(); i++) {
                set.remove(s.substring(i));
            }
        }
        int ans = 0;
        for (String s : set) {
            ans += s.length() + 1;
        }
        return ans;
    }
}

