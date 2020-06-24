import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * @author Micgogi
 * on 6/24/2020  11:24 AM
 * Rahul Gogyani
 */
public class B499 {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String s[] = br.readLine().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            HashMap<String, String> hm = new HashMap<>();
            for (int i = 0; i <m ; i++) {
                String s2[] = br.readLine().split(" ");
                hm.put(s2[0],s2[1]);
            }
            String s3[] = br.readLine().split(" ");
            for (int i = 0; i <n ; i++) {
              if(s3[i].length()<=hm.get(s3[i]).length()){
                  System.out.print(s3[i]+" ");
              }else{
                  System.out.print(hm.get(s3[i])+" ");
              }
            }
        }catch (Exception e){

        }
    }
}
