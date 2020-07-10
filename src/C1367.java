import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author Micgogi
 * on 7/10/2020  10:13 AM
 * Rahul Gogyani
 */
public class C1367 {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());
            while (t--!=0){
                String s[] = br.readLine().split(" ");
                int n = Integer.parseInt(s[0]);
                int k = Integer.parseInt(s[1]);
                int count =0;
                int a[] = Arrays.stream(br.readLine().split("")).mapToInt(Integer::parseInt).toArray();
                int prefix[] = new int[a.length];
                int suffix[] = new int[a.length];
                Arrays.fill(prefix,-1);
                Arrays.fill(suffix,-1);
                int temp =-1;
                for (int i = 0; i <a.length ; i++) {
                   if(a[i]==1){
                       temp=i;
                   }
                   prefix[i] = temp;
                }
                temp = -1;
                for (int i = a.length-1; i >=0 ; i--) {
                    if(a[i]==1){
                        temp = i;
                    }
                    suffix[i] = temp;
                }

                for (int i = 0; i <a.length ; i++) {
                    if(i-prefix[i]>k&&suffix[i]-i>k){
                        count++;
                        a[i] = 1;
                    }
                }
                System.out.println(count);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
