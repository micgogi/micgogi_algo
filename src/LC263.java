import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Micgogi
 * on 3/27/2020  3:17 PM
 * Rahul Gogyani
 */
public class LC263 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());
            boolean flag = true;
            while(n!=1){
                if(n%2==0){
                    n/=2;
                    flag = true;
                }else if(n%3==0){
                    n/=3;
                    flag = true;
                }else if(n%5==0){
                    n/=5;
                    flag=true;
                }else{
                    flag = false;
                    break;
                }
            }
            System.out.println(flag);
        }catch (Exception e){

        }
    }
}
