import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 12/5/2021  4:22 PM
 * Rahul Gogyani
 */
public class LC1151 {
    public static void main(String args[]) {
        System.out.println(new LC1151().minSwaps(new int[]{1, 0, 1, 0, 1}));
    }

    public int minSwaps(int[] arr) {
        int size = 0;
        for (int num : arr) size += num;
        int currentSize = 0;
        int maxOnes = 0;
        for (int i = 0; i < arr.length; i++) {
            currentSize += arr[i];
            if (i >= size) {
                currentSize -= arr[i - size];
            }
            maxOnes = Math.max(maxOnes, currentSize);
        }
        return size - maxOnes;

    }
}

