import com.sun.java.swing.plaf.windows.WindowsTextAreaUI;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;

/**
 * @author Micgogi
 * on 4/3/2020  3:16 PM
 * Rahul Gogyani
 */
public class LC300 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int a[] = {10,9,2,5,3,7,101,18};

            int len = 0;
            int[] dp = new int[a.length];

            for (int num : a) {
                int index = Arrays.binarySearch(dp, 0, len, num);


                if (index < 0) {
                    index = -(index + 1);
                }
                dp[index] = num;
                if (index == len) {
                    ++len;
                }
            }
            System.out.println(len);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

