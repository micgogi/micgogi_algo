import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 11/18/2021  12:51 PM
 * Rahul Gogyani
 */
public class LIS122 {
    public static void main(String args[]) {
        System.out.println(new LIS122().lengthOFLis(new int[]{2, 6, 8, 3, 4, 5, 1}));
    }

    public int lengthOFLis(int[] nums) {
        int[] tails = new int[nums.length];
        int size = 0;
        for (int num : nums) {
            int i = 0, j = size;
            while (i != j) {
                int m = (i + j) / 2;
                if (tails[m] < num) i = m + 1;
                else j = m;
            }
            tails[i] = num;
            if (i == size) size++;
        }
        return size;
    }
}

