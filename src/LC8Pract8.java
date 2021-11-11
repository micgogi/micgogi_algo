import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 11/11/2021  6:24 PM
 * Rahul Gogyani
 */
public class LC8Pract8 {
    public static void main(String args[]) {
        System.out.println(myAtoi("-91283472332"));
    }

    public static int myAtoi(String s) {
        s = s.trim();
        if (s.length() == 0) return 0;
        boolean isNeg = false;
        boolean flag = false;
        long ans = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i==0 &&s.charAt(0) == '-') {
                isNeg = true;
            } else if (i==0 && s.charAt(0) == '+') {
                isNeg = false;
            } else if (Character.isDigit(s.charAt(i))) {
                ans = ans * 10 + (int) (s.charAt(i) - '0');
                if (ans > Integer.MAX_VALUE) {
                    ans = Integer.MAX_VALUE;
                    flag = true;
                    break;
                }
            } else {
                break;
            }
        }
        if (isNeg) {
            if(flag)ans=Integer.MIN_VALUE;
            else ans = -ans;
        }
        return (int) ans;
    }

}

