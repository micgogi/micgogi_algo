import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.BufferOverflowException;

/**
 * @author Micgogi
 * on 5/4/2020  10:54 AM
 * Rahul Gogyani
 */
public class A71 {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t= Integer.parseInt(br.readLine());
            while(t--!=0){
                String s = br.readLine();
                StringBuilder sb = new StringBuilder();
                if(s.length()>10){
                    int n=s.length()-2;
                   s = ""+s.charAt(0)+n+s.charAt(s.length()-1);

                }
                System.out.println(s);
            }
        }catch (Exception e){

        }
    }
}
