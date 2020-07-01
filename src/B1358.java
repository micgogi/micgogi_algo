import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author Micgogi
 * on 7/1/2020  5:32 PM
 * Rahul Gogyani
 */
public class B1358 {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());
            while(t--!=0){
                int n = Integer.parseInt(br.readLine());
                int a[];
                String s[] = br.readLine().split(" ");

                a = Arrays.stream(s).mapToInt(Integer::parseInt).toArray();
                Arrays.sort(a);
                System.out.println(ans(a));

            }
        }catch (Exception e){

        }
    }
    public static int ans(int a[]){
        for (int i = a.length-1; i >=0 ; i--) {
            if(a[i]<=i+1){
               return i+2;
            }
        }
        return 1;
    }
}
