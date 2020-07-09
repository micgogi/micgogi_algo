import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Micgogi
 * on 7/9/2020  5:31 PM
 * Rahul Gogyani
 */
public class A1367 {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());
            while (t--!=0){
                String s = br.readLine();
                char zero = s.charAt(0);
                char last = s.charAt(s.length()-1);
                StringBuilder sb = new StringBuilder();
                for (int i = 1; i <s.length()-1 ; i+=2) {
                    sb.append(s.charAt(i));
                }
                System.out.println(zero+sb.toString()+last);
            }
        }catch (Exception e){


        }
    }

}
