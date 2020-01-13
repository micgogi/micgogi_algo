import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Micgogi
 * on 1/13/2020  11:36 PM
 * Micgogi
 */
public class CC_BRKBKS {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());
            while (t--!=0){
                String s = br.readLine();
                String s1[] = s.split(" ");
                int s2 =Integer.parseInt(s1[0]);
                int w1 = Integer.parseInt(s1[1]);
                int w2 = Integer.parseInt(s1[2]);
                int w3 = Integer.parseInt(s1[3]);
                if(s2>=w1+w2+w3){
                    System.out.println(1);
                }else if(w1+w2<=s2||w2+w3<=s2){
                    System.out.println(2);
                }else {
                    System.out.println(3);
                }
            }
        }catch (Exception e){

        }
    }
}
