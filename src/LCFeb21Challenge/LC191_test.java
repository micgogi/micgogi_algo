package LCFeb21Challenge;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Micgogi
 * on 3/27/2020  2:26 PM
 * Rahul Gogyani
 */
public class LC191_test {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String s = br.readLine();
            String bs = Integer.toBinaryString(Integer.parseInt(s));
            int count = 0;
            for (int i = 0; i < bs.length(); i++) {
                if (bs.charAt(i) == '1') {
                    count++;
                }
            }
            System.out.println(hammingWeight(Integer.parseInt(s)));

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    //fast
    public static int hammingWeight(int n) {
        int count = 32;
        int res = 0;
        while (count-- > 0) {
            if ((n & 1) == 1)
                res++;
            n = n >> 1;
        }
        return res;
    }
}
