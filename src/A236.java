import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @author Micgogi
 * on 5/8/2020  2:54 PM
 * Rahul Gogyani
 */
public class A236 {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String s = br.readLine();
            System.out.println(s.chars().distinct().count()%2<1?"CHAT WITH HER!":"IGNORE HIM!");

        }catch (Exception e){

        }
    }
}
