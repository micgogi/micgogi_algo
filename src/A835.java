import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Micgogi
 * on 7/1/2020  2:49 PM
 * Rahul Gogyani
 *  2·t 1 + v 1·s
 */
public class A835 {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
            String s[] = br.readLine().split(" ");
            int s1 = Integer.parseInt(s[0]);
            int v1 = Integer.parseInt(s[1]);
            int v2 = Integer.parseInt(s[2]);
            int t1 = Integer.parseInt(s[3]);
            int t2 = Integer.parseInt(s[4]);
            long c1 =  s1*v1+2*t1;
            long c2 = s1*v2+2*t2;

            if(c1==c2){
                System.out.println("Friendship");
            }else if(c1<c2){
                System.out.println("First");
            }else{
                System.out.println("Second");
            }




        }catch (Exception e){

        }
    }
}
