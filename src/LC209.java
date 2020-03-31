import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Micgogi
 * on 3/31/2020  11:49 AM
 * Rahul Gogyani
 */
public class LC209 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());
            String s[] = br.readLine().split(" ");
            int a[] = new int[n];
            for (int i = 0; i <s.length ; i++) {
                a[i]=Integer.parseInt(s[i]);
            }
            int sum = Integer.parseInt(br.readLine());
            int l=0;
            int res = Integer.MAX_VALUE;
            int val=0;
            for (int i = 0; i <a.length ; i++) {
                val+=a[i];
                while(val>=sum){
                    res=Math.min(res,i+1-l);
                    val-=a[l];
                    l++;
                }
            }
            System.out.println(res==Integer.MAX_VALUE?0:res);
        }catch (Exception e){

        }
    }
}
