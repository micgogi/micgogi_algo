import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @author Micgogi
 * on 5/13/2020  11:09 AM
 * Rahul Gogyani
 */
public class HEDP1 {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                int n = Integer.parseInt(br.readLine());
                String s[] = br.readLine().split(" ");
                int a[] = new int[n];
                for (int i = 0; i <a.length ; i++) {
                    a[i]=Integer.parseInt(s[i]);
                }
                int suff[] = new int[n];
                int pref[] = new int[n];
                Arrays.fill(pref,1);
                Arrays.fill(suff,1);
                for (int i = 0; i <a.length-1; i++) {
                    if(a[i+1]>a[i]){
                        pref[i+1]+=pref[i];
                    }
                }
                for (int i =a.length-2; i >0 ; i--) {
                    if(a[i+1]>a[i]){
                        suff[i]+=suff[i+1];

                    }
                }
                int ans=0;
                for (int i = 1; i <a.length-1 ; i++) {
                    if(a[i+1]>a[i-1]){
                        ans = Math.max(ans,pref[i-1]+suff[i+1]);
                    }
                }
                System.out.println(ans);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
