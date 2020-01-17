import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Micgogi
 * on 1/17/2020  10:09 PM
 * Micgogi
 */
public class CC_ERROR {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t= Integer.parseInt(br.readLine());
            while (t--!=0){
                String s = br.readLine();

                if(s.contains("010")||s.contains("101")){
                    System.out.println("Good");

                }else {
                    System.out.println("Bad");
                }
            }
        }catch (Exception e){

        }
    }
}
