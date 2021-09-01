
import java.util.Arrays;


/**
 * @author Micgogi
 * on 4/17/2020  11:39 AM
 * Rahul Gogyani
 */
public class LC242 {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        char sc[] = s.toCharArray();
        char tc[] = t.toCharArray();
       Arrays.sort(sc);
        Arrays.sort(tc);
        System.out.println(sc);
        System.out.println(tc);

        if(String.valueOf(sc).equals(String.valueOf(tc))){
            System.out.println(true);
        }
    }
}
