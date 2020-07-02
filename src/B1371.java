import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Micgogi
 * on 7/2/2020  11:08 AM
 * Rahul Gogyani
 */
public class B1371 {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());
            while (t--!=0){
                String s[] = br.readLine().split(" ");
                long n = Long.parseLong(s[0]);
                long r = Long.parseLong(s[1]);
                if(n>r){
                    System.out.println(r*(r+1)/2);
                }else{
                    System.out.println(n*(n-1)/2+1);
                }
            }
        }catch (Exception e){

        }
    }
}
