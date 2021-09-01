package LCJan21Challenge;

/**
 * @author Micgogi
 * on 1/17/2021  1:48 PM
 * Rahul Gogyani
 */
public class LC1641 {
    public static void main(String[] args) {
        System.out.println(countVowelStrings(50));
    }

    public static int countVowelStrings(int n) {
        int[] count = {0, 1, 1, 1, 1, 1};
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 5; j++) {
                count[j] += count[j - 1];
            }
        }
        return count[count.length - 1];
    }
}

