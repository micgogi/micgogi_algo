import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Micgogi
 * on 5/6/2020  3:10 PM
 * Rahul Gogyani
 */
public class A189 {
    public static void main(String[] args) {
        try{
            BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
            String s[] = br.readLine().split(" ");
            int n = Integer.parseInt(s[0]);
            int a = Integer.parseInt(s[1]);
            int b = Integer.parseInt(s[2]);
            int c = Integer.parseInt(s[3]);
            int max=0;
            for (int i = 0; i*a <=n ; i++) {
                for (int j = 0; i*a+j*b <=n ; j++) {
                    int k = (n-i*a-j*b)/c;
                    if(a*i+j*b+c*k==n){
                        max=Math.max(max,i+j+k);
                    }
                }
            }
            System.out.println(max);
        }catch (Exception e){

        }
    }
}
