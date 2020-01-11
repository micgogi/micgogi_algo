import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @author Micgogi
 * on 1/11/2020  11:27 PM
 * Micgogi
 */
public class CC_JOHNY {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());
            while (t--!=0){
                int n = Integer.parseInt(br.readLine());
                long a[] = new long[n];
                String s = br.readLine();
                int j= Integer.parseInt(br.readLine());
                long temp =0;
                String s1[] = s.split(" ");
                for (int i = 0; i < a.length; i++) {
                    a[i]=Long.parseLong(s1[i]);
                    if(j-1==i){
                        temp = a[i];
                    }
                }
                Arrays.sort(a);
                for (int i = 0; i <a.length ; i++) {
                    if(temp==a[i]){
                        System.out.println(i+1);
                        break;
                    }
                }


            }
        }catch (Exception e){

        }
    }
}
