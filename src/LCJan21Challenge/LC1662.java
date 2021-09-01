package LCJan21Challenge;

/**
 * @author Micgogi
 * on 1/8/2021  4:56 PM
 * Rahul Gogyani
 */
public class LC1662 {
    public static void main(String args[]) {
        String[] word1 = {"6578", "75", "738465"};
        String[] word2 = {"657875738465"};
        System.out.println(arrayStringsAreEqual(word1, word2));

    }

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String f = "", s = "";
        for (int i = 0; i < word1.length; i++) {
            f = f + word1[i];
        }
        for (int i = 0; i < word2.length; i++) {
            s = s + word2[i];
        }
        return f.equals(s);
    }
}

