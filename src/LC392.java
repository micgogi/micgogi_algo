/**
 * @author Micgogi
 * on 1/12/2022  4:45 PM
 * Rahul Gogyani
 */
public class LC392 {
    public static void main(String args[]) {
        System.out.println(new LC392().isSubsequence("fjjf","udhdhd"));
    }

    public boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;
        for (; j < t.length(); j++) {
            if (i < s.length() && s.charAt(i) == t.charAt(j)) i++;
        }
        return i == s.length();
    }

}

