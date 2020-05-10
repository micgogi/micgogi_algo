import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Micgogi
 * on 5/10/2020  12:06 PM
 * Rahul Gogyani
 */
public class A1338 {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());
            while(t--!=0){
                int n = Integer.parseInt(br.readLine());
                String s[] = br.readLine().split(" ");
                int a[] = new int[n];
                for (int i = 0; i <a.length ; i++) {
                    a[i]=Integer.parseInt(s[i]);
                }
                int max =0;
                for (int i = 1; i <n ; i++) {
                    int diff = a[i-1]-a[i];
                    if(diff>0){
                        int x = Integer.toBinaryString(diff).length();
                        max = Math.max(max,x);
                        a[i]=a[i-1];
                    }
                }
                System.out.println(max);
            }
        }catch (Exception e){

        }
    }
}
