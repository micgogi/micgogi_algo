import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Micgogi
 * on 11/18/2019  1:44 AM
 *
 */
public class LC5 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String s = br.readLine();
            int count =0;
            int max=0;
            for (int i = 0; i <s.length()-1 ; i++) {
                if(s.charAt(i)==s.charAt(i+1)){
                    count=0;
                }else{
                    count++;
                    if(count>max)max=count;
                }
            }
            System.out.println(max);
        }catch (Exception e){

        }
    }
}
