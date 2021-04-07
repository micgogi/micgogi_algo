

/**
 * @author Micgogi
 * on 4/7/2021  1:42 PM
 * Rahul Gogyani
 */
public class LC1704 {
    public static void main(String args[]) {
        System.out.println(halvesAreAlike("QWERTYUIOPASDFGH"));
    }


    public static boolean halvesAreAlike(String s) {
        String first = s.substring(0, s.length() / 2);
        String second = s.substring(s.length() / 2);
        int count1 = 0;
        int count2 = 0;
        for (char c : first.toCharArray()) {
            if (checkVowel(c)) {
                count1++;
            }
        }
        for (char c : second.toCharArray()) {
            if (checkVowel(c)) {
                count2++;
            }
        }
        if (count1 == count2) return true;
        return false;
    }

    public static boolean checkVowel(char c) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
            return true;
        }
        return false;
    }
}

