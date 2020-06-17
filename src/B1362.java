import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;

/**
 * @author Micgogi
 * on 6/17/2020  11:25 AM
 * Rahul Gogyani
 */
public class B1362 {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());
            while (t--!=0){
                int n = Integer.parseInt(br.readLine());
                long a[] = new long[n];
                String s[] = br.readLine().split(" ");
                HashSet<Long> hs = new HashSet<>();

                for (int i = 0; i<s.length; i++) {
                    a[i] = Long.parseLong(s[i]);
                    hs.add(a[i]);

                }
                boolean flag = true;
                int ans=0;
                for (int i = 1; i <=1024 ; i++) {
                    flag = true;
                    for (int j = 0; j <a.length ; j++) {
                        long k = a[j]^i;
                        if(!hs.contains(k)){
                            flag=false;
                        }

                    }
                    if(flag){
                        ans = i;
                        break;
                    }
                }
                if(flag){
                    System.out.println(ans);
                }else {
                    System.out.println(-1);
                }


            }
        }catch (Exception e){

        }
    }
}
