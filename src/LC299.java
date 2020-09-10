import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 9/10/2020  2:32 PM
 * Rahul Gogyani
 */
public class LC299 {
    public static void main(String args[]) {

    }

    public static String getHint(String secret, String guess) {
        int[] count = new int[10];
        int bulls =0;
        int cow = 0;
        for (int i = 0; i <secret.length(); i++) {
            if(secret.charAt(i)==guess.charAt(i))bulls++;
            else{
                if(count[secret.charAt(i)-'0']++<0)cow++;
                if(count[guess.charAt(i)-'0']-->0)cow++;
            }
        }
        return bulls+"A"+cow+"B";
    }

}

