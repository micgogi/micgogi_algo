import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Micgogi
 * on 1/15/2020  10:57 AM
 * Micgogi
 */
public class CC_CNOTE {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t= Integer.parseInt(br.readLine());
            while (t--!=0){
                String s = br.readLine();
                String s1[] = s.split(" ");
                int X=Integer.parseInt(s1[0]);
                int Y = Integer.parseInt(s1[1]);
                int K = Integer.parseInt(s1[2]);
                int N = Integer.parseInt(s1[3]);
                int np = X-Y;
                boolean flag = false;
                for (int i = 0; i <N ; i++) {
                    String s2 = br.readLine();
                    String s3[] = s2.split(" ");
                    int p = Integer.parseInt(s3[0]);
                    int r = Integer.parseInt(s3[1]);

                    if(p>=np&&K>=r){
                        flag = true;

                    }
                }
                if(flag){
                    System.out.println("LuckyChef");
                }else {
                    System.out.println("UnluckyChef");
                }
            }
        }catch (Exception e){

        }
    }
}
