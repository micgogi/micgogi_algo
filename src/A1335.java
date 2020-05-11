import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Micgogi
 * on 5/11/2020  11:04 AM
 * Rahul Gogyani
 */
public class A1335 {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());
            while(t--!=0){
                long noOfCandies = Long.parseLong(br.readLine());
                noOfCandies--;
                if(noOfCandies<=1) System.out.println(0);
                else{
                    System.out.println(noOfCandies/2);
                }
            }
        }catch (Exception e){

        }
    }
}
