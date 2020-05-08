import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.concurrent.ExecutionException;

/**
 * @author Micgogi
 * on 5/8/2020  5:28 PM
 * Rahul Gogyani
 */
public class B489 {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());
            int a[] = new int[n];
            String s[] = br.readLine().split(" ");
            for (int i = 0; i <s.length ; i++) {
                a[i]=Integer.parseInt(s[i]);
            }
            int m = Integer.parseInt(br.readLine());
            String s1[] = br.readLine().split(" ");
            int b[] = new int[m];
            for (int i = 0; i <s1.length ; i++) {
                b[i]=Integer.parseInt(s1[i]);
            }
            Arrays.sort(a);
            Arrays.sort(b);
            int i=0,j=0,res=0;
            while(i<n&&j<m){
                if(a[i]-b[j]>1)j++;
                else if(b[j]-a[i]>1)i++;
                else {
                    i++;
                    j++;
                    res++;
                }
            }
            System.out.println(res);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
