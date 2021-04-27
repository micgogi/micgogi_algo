/**
 * @author Micgogi
 * on 4/19/2020  12:21 PM
 * Rahul Gogyani
 */
public class LC326 {
    public static void main(String[] args) {
        int n = 27;
        System.out.println(isPowerOfThree(n));

    }

    public static boolean isPowerOfThree(int n) {
        if (n < 1) {
            return false;
        }
        while (n % 3 == 0) {
            n /= 3;
        }
        return n == 1;

    }
}
