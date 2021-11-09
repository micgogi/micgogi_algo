import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 11/9/2021  6:39 PM
 * Rahul Gogyani
 */
public class GGFindLongestSubstring {
    public static void main(String args[]) {
        System.out.println(maxLength("giraffe".toCharArray(), "01111001111111111011111111".toCharArray(), 2));
    }

    //Find length of longest substring with at most K normal characters
    public static int maxLength(char[] s, char[] charactersvalue, int k) {
        int n = s.length;
        if (k == 0) return 0;
        int left = 0, right = 0;
        int maxLength = 0;
        int count = 0;
        while (right < n) {
            while (right < n && count <= k) {
                if (charactersvalue[s[right] - 'a'] == '0') {
                    if (count == k) break;
                    else count++;
                }
                right++;
                if (count <= k){
                    maxLength = Math.max(maxLength, right - left);
                    System.out.println(right -left);
                }
            }
            while (left < right) {
                left++;
                if (charactersvalue[s[left] - 'a'] == '0') {
                    count--;

                }
                if (count < k) break;
            }
        }
        return maxLength;
    }


}

