
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Micgogi
 * on 5/24/2020  9:10 AM
 * Rahul Gogyani
 */
public class A716 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String s[] = br.readLine().split(" ");
            int  n = Integer.parseInt(s[0]);
            int t = Integer.parseInt(s[1]);
            String s1[] = br.readLine().split(" ");
            int a[] = new int[n];
            for (int i = 0; i <a.length ; i++) {
                a[i]= Integer.parseInt(s1[i]);
            }
            int count=1;
            int prev = a[0];
            for (int i = 1; i <a.length ; i++) {
                int curr = a[i];
                if(curr-prev>t)count=1;
                else{
                    count++;
                }
                prev = a[i];
            }
            System.out.println(count);
        }catch (Exception e){

        }
    }
}
