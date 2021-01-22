import java.util.Arrays;

/**
 * @author Micgogi
 * on 1/22/2021  7:48 PM
 * Rahul Gogyani
 */
public class LC1657 {
    public static void main(String args[]) {
        System.out.println(closeStrings("abbccc", "abbccc"));
    }

    public static boolean closeStrings(String word1, String word2) {
        int[] count1 = new int[26];
        int[] count2 = new int[26];
        boolean[] exist1 = new boolean[26];
        boolean[] exist2 = new boolean[26];
        for (int i = 0; i < word1.length(); i++) {
            count1[word1.charAt(i) - 'a']++;
            exist1[word1.charAt(i) - 'a'] = true;
        }
        for (int i = 0; i < word2.length(); i++) {
            count2[word2.charAt(i) - 'a']++;
            exist2[word2.charAt(i) - 'a'] = true;
        }
        Arrays.sort(count1);
        Arrays.sort(count2);
        return Arrays.equals(count1, count2) && Arrays.equals(exist1, exist2);
    }
}

