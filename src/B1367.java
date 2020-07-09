import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @author Micgogi
 * on 7/9/2020  5:37 PM
 * Rahul Gogyani
 */
public class B1367 {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());
            while (t--!=0){
                int n = Integer.parseInt(br.readLine());
                int a[] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

                int o=0,e=0;
                for (int i = 0; i <a.length ; i++) {
                    if(i%2!=a[i]%2){
                        if(i%2==0){
                            e++;
                        }else{
                            o++;
                        }
                    }
                }
               if(e!=o){
                   System.out.println(-1);
               }else{
                   System.out.println(e);
               }

            }
        }catch (Exception e){

        }
    }

}
