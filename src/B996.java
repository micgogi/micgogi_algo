import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Micgogi
 * on 5/7/2020  11:30 AM
 * Rahul Gogyani
 */
public class B996 {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());
            String s[] = br.readLine().split(" ");
            int a[] = new int[n];
            int min = Integer.MAX_VALUE;
            int pos =0;
            for (int i = 0; i <n ; i++) {
                a[i]= Integer.parseInt(s[i]);
                int t= (int)Math.ceil((a[i]-i)/(1.0*n));
                if(t<min){
                    min = t;
                    pos = i;
                }
            }

            System.out.println(pos+1);
        }catch (Exception e){

        }
    }
}
