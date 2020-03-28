import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Micgogi
 * on 3/28/2020  2:52 PM
 * Rahul Gogyani
 */
public class CC_AND {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());
            long a[] = new long[n];

            int c1=0;
            String s[]  = br.readLine().split(" ");
            long max =0;
            for (int i = 0; i <s.length ; i++) {
                a[i]=Long.parseLong(""+s[i]);
               if(a[i]>max)max =a[i];
               if(a[i]==1) c1++;
            }
            if(max==1||max==0){
                System.out.println((c1*(c1-1))/2);
            }else{
                int res=0;
                for (int i = 0; i <n-1 ; i++) {
                    for (int j = i+1; j <n ; j++) {
                        res+=(a[i]&a[j]);
                    }
                }
                System.out.println(res);
            }
        }catch (Exception e){

        }
    }
}
