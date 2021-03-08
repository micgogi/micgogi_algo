package March21Challenge;

/**
 * @author Micgogi
 * on 3/8/2021  6:11 PM
 * Rahul Gogyani
 */
public class LC1332 {
    public static void main(String args[]) {
        System.out.println(removePalindromeSub("ababa"));
    }

    public static int removePalindromeSub(String s) {
        if (s.isEmpty()) return 0;
        else if (new StringBuilder(s).reverse().toString().equals(s)) return 1;
        else {
            return 2;
        }
    }

}

