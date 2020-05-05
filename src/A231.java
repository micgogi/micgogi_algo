import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Micgogi
 * on 5/5/2020  10:24 AM
 * Rahul Gogyani
 */
public class A231 {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());
            int m=0;
            for (int i = 0; i <n ; i++) {
                int count=0;
                String s[] = br.readLine().split(" ");
                if(s[0].equals("1")){
                   count++;
                }
                if(s[1].equals("1")){
                  count++;
                }
                if(s[2].equals("1")){
                    count++;
                }
                if(count>=2){
                    m++;
                }
            }
            System.out.println(m);
        }catch (Exception e){

        }
    }
}
