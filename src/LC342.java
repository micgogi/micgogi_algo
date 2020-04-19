/**
 * @author Micgogi
 * on 4/19/2020  12:30 PM
 * Rahul Gogyani
 */
public class LC342 {
    public static void main(String[] args) {
        int n = 16;
        System.out.println(isPowerOfFour(n));
    }

    public static boolean isPowerOfFour(int n) {
        if (n < 1) {
            return false;
        }
        while (n % 4 == 0) {
            n /= 4;
        }
        return n == 1;
    }
}
