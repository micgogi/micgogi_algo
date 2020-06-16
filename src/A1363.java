import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Micgogi
 * on 6/15/2020  8:47 PM
 * Rahul Gogyani
 */
public class A1363 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());
            while (t-- != 0) {
                String s[] = br.readLine().split(" ");
                int n = Integer.parseInt(s[0]);
                int x = Integer.parseInt(s[1]);
                String s2[] = br.readLine().split(" ");
                int f[] = new int[2];
                for (int i = 0; i < s2.length; i++) {
                    f[Integer.parseInt(s2[i]) % 2]++;
                }
                if(f[1]==0){
                    System.out.println("No");
                }else{
                    int noOfOdd = Math.min(f[1],x);
                    if(noOfOdd%2==0){
                        noOfOdd--;
                    }
                    int remain = x-noOfOdd;
                    if(remain<=f[0]){
                        System.out.println("Yes");
                    }else{
                        System.out.println("No");
                    }
                }



            }
        } catch (Exception e) {

        }
    }
}
