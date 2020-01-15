import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Micgogi
 * on 1/15/2020  10:55 AM
 * Micgogi
 */
public class CC_STONES {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());
            while(t--!=0){
                String j = br.readLine();
                String s= br.readLine();
                int count = 0;
                for (int i = 0; i <s.length() ; i++) {
                    for (int l = 0; l <j.length() ; l++) {
                        if(j.charAt(l)==s.charAt(i)){
                            count++;
                            break;

                        }
                    }
                }
                System.out.println(count);
            }
        }catch (Exception e){
            // e.printStackTrace();
        }
    }
}
