import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Micgogi
 * on 5/8/2020  4:27 PM
 * Rahul Gogyani
 */
public class A451 {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String s[] = br.readLine().split(" ");
            int a = Integer.parseInt(s[0]);
            int b = Integer.parseInt(s[1]);

            if(Math.min(a,b)%2==0){
                System.out.println("Malvika");
            }else {
                System.out.println("Akshat");
            }
        }catch (Exception e){

        }
    }
}
