import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Micgogi
 * on 1/21/2020  9:28 PM
 * Micgogi
 */
public class CC_RIGHTRI {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());
            int count =0;
            for (int i = 0; i <n ; i++) {
                String s = br.readLine();
                String s1[] = s.split(" ");
                int x1 = Integer.parseInt(s1[0]);
                int y1 = Integer.parseInt(s1[1]);
                int x2 = Integer.parseInt(s1[2]);
                int y2 = Integer.parseInt(s1[3]);
                int x3 = Integer.parseInt(s1[4]);
                int y3 = Integer.parseInt(s1[5]);
                if(x1!=x2||x2!=x3&&y1!=y2||y2!=y3) {
                    int d1 = (x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2);
                    int d2 = (x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3);
                    int d3 = (x3 - x1) * (x3 - x1) + (y3 - y1) * (y3 - y1);
                    if (d1==(d2+d3)||d2==(d3+d1)||d3==(d1+d2)){
                        count++;
                    }

                }
            }
            System.out.println(count);
        }catch (Exception e){

        }
    }
}
