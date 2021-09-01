import java.util.Arrays;

/**
 * @author Micgogi
 * on 3/21/2021  12:43 PM
 * Rahul Gogyani
 */
public class LC869 {
    public static void main(String args[]) {
        System.out.println(reorderedPowerOf2(65787573));
    }

    public static boolean reorderedPowerOf2(int N) {
        int[] count = new int[10];
        while (N > 0) {
            count[N % 10]++;
            N /= 10;
        }
        for (int i = 0; i < 31; i++) {
            int n = 1 << i;
            int[] newCount = new int[10];
            while (n > 0) {
                newCount[n % 10]++;
                n /= 10;
            }
            if (Arrays.equals(count, newCount)) return true;
        }
        return false;
    }

}

