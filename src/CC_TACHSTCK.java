import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @author Micgogi
 * on 1/21/2020  10:19 PM
 * Micgogi
 */
public class CC_TACHSTCK {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String s = br.readLine();
            String s1[] = s.split(" ");
            int n = Integer.parseInt(s1[0]);
            int  d =Integer.parseInt(s1[1]);
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i]=Integer.parseInt(br.readLine());
                
            }
            int count =0;
            Arrays.sort(a);
            for (int i = 0; i < a.length-1; i++) {
                if(a[i+1]-a[i]<=d){
                    count++;
                    i=i+1;

                }


            }
            System.out.println(count);
        }catch (Exception e){

        }
    }
}
