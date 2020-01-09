import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Micgogi
 * on 1/9/2020  11:52 PM
 * Micgogi
 */
public class CC_CIELAB {
    public static void main(String[] args) {
        try{

            BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
            String s = b.readLine();
            String s1[] = s.split(" ");
            int a = Integer.parseInt(s1[0])-Integer.parseInt(s1[1]);
            if(a%10!=9){
                a++;
            }else{
                a--;
            }
            System.out.println(a);
        } catch (Exception e) {

        }
    }
}
