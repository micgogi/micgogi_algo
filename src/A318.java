import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Inet4Address;

/**
 * @author Micgogi
 * on 5/15/2020  9:34 AM
 * Rahul Gogyani
 */
public class A318 {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String s[] = br.readLine().split(" ");
            long n = Long.parseLong(s[0]);
            long t = Long.parseLong(s[1]);
            long mid =n/2;
            if(n%2==1)mid++;
           // System.out.println(mid);


            if(t>mid){
                System.out.println((t-mid)*2);
            }else{
                System.out.println(t*2-1);
            }
        }catch (Exception e){

        }
    }
}
