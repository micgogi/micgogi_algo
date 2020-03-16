import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @author Micgogi
 * on 11/24/2019  9:55 PM
 *
 */
public class ALPHABET {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String s = br.readLine();
            char[] c = s.toCharArray();
            int n = Integer.parseInt(br.readLine());
            boolean flag =false;
            for (int i = 0; i <n ; i++) {
                String s1 = br.readLine();
                char c1[] = s1.toCharArray();
                Arrays.sort(c1);
                Arrays.sort(c);

                for (int j = 0; j <c.length ; j++) {
                        if(c[j]==c1[j]){
                            flag=true;
                        }else{
                            flag=false;
                            break;
                        }
                }

                if(flag) System.out.println("Yes");
                else System.out.println("No");


            }
        }catch (Exception e){

        }
    }
}
