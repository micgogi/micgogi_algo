package july21challenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 7/14/2021  12:46 PM
 * Rahul Gogyani
 */
public class LC791 {
    public static void main(String args[]) {
        System.out.println(customSortString("cba","abcd"));
    }
    public static String customSortString(String order, String str) {
        int[] count = new int[26];
        for (char c: str.toCharArray())count[c-'a']++;
        StringBuilder sb = new StringBuilder();
        for (char c:order.toCharArray()){
            while (count[c-'a']-->0){
                sb.append(c);
            }
        }
        for (char c='a'; c<='z';c++){
            while (count[c-'a']-->0){
                sb.append(c);
            }
        }
        return sb.toString();
    }
}

