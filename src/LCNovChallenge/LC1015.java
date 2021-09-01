package LCNovChallenge;

/**
 * @author Micgogi
 * on 11/25/2020  6:45 PM
 * Rahul Gogyani
 */
public class LC1015 {
    public static void main(String args[]) {
        System.out.println(smallestRepunitDivByK(111));
    }

    public static int smallestRepunitDivByK(int k) {
        int rem = 0;
        for (int i = 1; i <= k; i++) {
            rem = (rem * 10 + 1) % k;
            if (rem == 0) return i;
        }
        return -1;
    }
}

