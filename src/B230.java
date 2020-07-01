import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collector;

/**
 * @author Micgogi
 * on 7/1/2020  11:22 AM
 * Rahul Gogyani
 */
public class B230 {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());
            String s[] = br.readLine().split(" ");
            long a[] = Arrays.stream(s).mapToLong(Long::parseLong).toArray();
            int b[] = new int[1000001];
            for (int i = 2; i <=1000 ; i++) {
                for (int j = i*2; j <=1000000 ; j+=i) {
                    if(b[j]==0) b[j]=1;
                }
            }
            for (int i = 0; i <a.length ; i++) {
                double m = Math.sqrt(a[i]);
                if(m==1){
                    System.out.println("NO");
                    continue;
                }
                if((int)m==m&&b[(int)m]==0){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
