import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Micgogi
 * on 7/7/2020  10:50 AM
 * Rahul Gogyani
 */
public class B1368 {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            long n = Long.parseLong(br.readLine());
            String s = "codeforces";
            char c[] = s.toCharArray();
            long mul =1;
            int i=0;
            int l[] = new int[]{1,1,1,1,1,1,1,1,1,1};
            while (mul<n){
                int a = l[i%10];
                l[i%10]++;
                mul= mul*l[i%10]/a;
                i++;
            }
            String s2="";
            for (int j = 0; j <10 ; j++) {
                for (int k = 0; k <l[j]; k++) {
                    s2+=c[j];
                }
            }
            System.out.println(s2);

        }catch (Exception e){

        }
    }

}
