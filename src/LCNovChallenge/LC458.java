package LCNovChallenge;

/**
 * @author Micgogi
 * on 11/14/2020  2:18 PM
 * Rahul Gogyani
 */
public class LC458 {
    public static void main(String args[]) {
        System.out.println(poorPigs(1000, 15, 60));
    }

    public static int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
        int pigs = 0;
        while (Math.pow(minutesToTest / minutesToDie + 1, pigs) < buckets) {
            pigs += 1;
        }
        return pigs;
    }
}

