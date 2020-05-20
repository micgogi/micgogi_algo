import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Micgogi
 * on 5/20/2020  2:52 PM
 * Rahul Gogyani
 */
public class A155 {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());
            int a[] = new int[n];
            String s[] =  br.readLine().split(" ");
            for (int i = 0; i <n ; i++) {
                a[i] = Integer.parseInt(s[i]);
            }
            int count=0;
            int min=a[0];
            int max=a[0];
            for (int i = 1; i <a.length; i++) {
                if(max<a[i]){
                    count++;
                    max=a[i];

                }
                if(a[i]<min){
                    min=a[i];
                    count++;
                }
            }
            System.out.println(count);
        }catch (Exception e){

        }
    }
}
