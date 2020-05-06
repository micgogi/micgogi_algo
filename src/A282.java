import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Micgogi
 * on 5/6/2020  12:39 PM
 * Rahul Gogyani
 */
public class A282 {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());
            int n=0;
            while(t--!=0){
                String s = br.readLine();
                if(s.charAt(1)=='+'){
                    n++;
                }else{
                    n--;
                }
            }
            System.out.println(n);
        }catch (Exception e){

        }
    }
}
