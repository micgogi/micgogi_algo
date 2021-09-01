package LCFeb21Challenge;

import java.util.Arrays;

/**
 * @author Micgogi
 * on 2/7/2021  2:55 PM
 * Rahul Gogyani
 */
public class LC821 {
    public static void main(String args[]) {
        String s = "loveleetcode";
        char c = 'e';
        int ind = -10001;
        int[] ans = new int[s.length()];
        for (int i = 0; i < ans.length; i++) {
            if (s.charAt(i) == c) ind = i;
            ans[i] = i - ind;
        }
        ind = 10001;
        System.out.println(Arrays.toString(ans));
        for (int i = ans.length - 1; i >= 0; i--) {
            if(s.charAt(i)==c)ind =i;
            ans[i] = Math.min(ans[i],ind -i);
        }
        System.out.println(Arrays.toString(ans));

    }
}

