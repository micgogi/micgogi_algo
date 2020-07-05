import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Micgogi
 * on 7/5/2020  3:01 PM
 * Rahul Gogyani
 */
public class LC461 {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String s[] = br.readLine().split(" ");
            int x = Integer.parseInt(s[0]);
            int y = Integer.parseInt(s[1]);
            int t = x^y;
            System.out.println(Integer.bitCount(t));
        }catch (Exception e){

        }
    }

}
