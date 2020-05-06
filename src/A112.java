import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @author Micgogi
 * on 5/6/2020  12:45 PM
 * Rahul Gogyani
 */
public class A112 {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String s1 = br.readLine().toLowerCase();
            String s2 = br.readLine().toLowerCase();
            int t = s1.compareTo(s2);
            System.out.println(t<0?-1:t>0?1:0);
        }catch (Exception e){


        }
    }
}
