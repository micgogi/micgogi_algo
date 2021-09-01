package august21;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 8/10/2021  7:42 PM
 * Rahul Gogyani
 */
public class LC926 {
    public static void main(String args[]) {
        System.out.println(minFlipsMonoIncr("100000010"));
    }

    public static int minFlipsMonoIncr(String s) {
        int count1=0, flip=0;
        for (int i = 0; i < s.length() ; i++) {
            if(s.charAt(i)=='1')count1++;
            else flip++;
            flip= Math.min(count1,flip);
        }
        return flip;
    }}


