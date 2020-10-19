

/**
 * @author Micgogi
 * on 10/19/2020  3:23 PM
 * Rahul Gogyani
 */
public class LC1405 {
    public static void main(String args[]) {
        System.out.println(longestDiverseString(1,1,7));
    }

    public static String longestDiverseString(int a, int b, int c) {
        return generate(a, b, c, "a", "b", "c");
    }

    public static String generate(int a, int b, int c, String aa, String bb, String cc) {
        if (a < b) {
            return generate(b, a, c, bb, aa, cc);
        }
        if (b < c) {
            return generate(a, c, b, aa, cc, bb);
        }
        if (b == 0) {
            return aa.repeat(Math.min(2, a));
        }
        int useA = Math.min(2, a);
        int useB = a - useA >= b ? 1 : 0;
        return aa.repeat(useA) + bb.repeat(useB) + generate(a - useA, b - useB, c, aa, bb, cc);
    }
}

