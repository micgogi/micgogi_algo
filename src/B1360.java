import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @author Micgogi
 * on 7/11/2020  11:47 AM
 * Rahul Gogyani
 */
public class B1360 {

    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());
            while (t--!=0){
                int n = Integer.parseInt(br.readLine());
                int a[] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
                Arrays.sort(a);
                int res = a[n-1]-a[0];
                for (int i = 0; i <n ; i++) {
                    for (int j = i+1; j <n ; j++) {
                        res = Math.min(res,a[j]-a[i]);
                    }
                }
                System.out.println(res);
                
            }
        }catch (Exception e){

        }
    }
}
