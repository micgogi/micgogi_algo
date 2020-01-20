import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Micgogi
 * on 1/20/2020  9:14 PM
 * Micgogi
 */
public class CC_SALARY {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t= Integer.parseInt(br.readLine());
            while (t--!=0){
                int n = Integer.parseInt(br.readLine());
                int a[] = new int[n];
                String s = br.readLine();
                String s1[] = s.split(" ");
                for (int i = 0; i <s1.length ; i++) {
                    a[i]= Integer.parseInt(s1[i]);
                }
                int min = Integer.MAX_VALUE;
                int sum=0;
                for (int i = 0; i <a.length ; i++) {
                    sum=sum+a[i];
                    if(a[i]<min)min=a[i];
                }
                System.out.println(sum-n*min);
            }
        }catch (Exception e){

        }
    }
}
