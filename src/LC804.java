import java.util.HashSet;
import java.util.Set;

/**
 * @author Micgogi
 * on 11/22/2020  1:32 PM
 * Rahul Gogyani
 */
public class LC804 {
    public static void main(String args[]) {
        String[] codes = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---",
                "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-",
                ".--", "-..-", "-.--", "--.."};
        String[] words = {"gin", "zen", "gig", "msg"};
        Set<String> res = new HashSet<>();
        for (String word : words) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < word.length(); i++) {
                sb.append(codes[word.charAt(i) - 'a']);
            }
            res.add(sb.toString());
        }
        System.out.println(res.size());
    }

}

