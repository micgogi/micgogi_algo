import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 8/8/2020  5:52 PM
 * Rahul Gogyani
 */

public class RandomTest {


    public static void main(String args[]) {
        int a[] = {1,4,6,9,16,8};
        for (int i = 0; i <a.length ; i++) {
            if((int)Math.sqrt(a[i])==Math.sqrt(a[i])){
                System.out.println(a[i]);
            }
        }
    }


}

