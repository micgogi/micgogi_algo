import java.util.Arrays;

/**
 * @author Micgogi
 * on 4/13/2021  10:43 AM
 * Rahul Gogyani
 */
public class LC667 {
    public static void main(String args[]) {
        System.out.println(Arrays.toString(constructArray(5, 3)));
    }

    public static int[] constructArray(int n, int k) {
        int[] result = new int[n];
        int high = n;
        int low = 1;
        int i = 0;
        result[i++] = low;
        boolean isHigh = false;
        while (k > 1) {
            result[i++] = high--;
            k--;
            isHigh = true;
            if (k > 1) {
                result[i++] = low++;
                k--;
                isHigh = false;
            }
        }
        while (i < n) {
            if (isHigh) {
                result[i++] = high--;
            } else {
                result[i++] = low--;
            }
        }
        return result;
    }

}

