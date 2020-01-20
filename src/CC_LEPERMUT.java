import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Micgogi
 * on 1/20/2020  9:15 PM
 * Micgogi
 */
public class CC_LEPERMUT {
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
                    a[i]=Integer.parseInt(s1[i]);
                }
                boolean flag =false;
                int count =0;
                int count1=0;
                boolean flag1 = false;
                if(a.length==1){
                    System.out.println("YES");
                }else{
                    for (int i = 0; i <a.length ; i++) {
                        for (int j = i+1; j <a.length ; j++) {
                            if(a[i]>=a[j]){

                                count++;
                            }
                        }
                    }
                    for (int i = 1; i <a.length ; i++) {
                        if(a[i-1]>=a[i])count1++;
                    }
                    if(count==count1) System.out.println("YES");
                    else System.out.println("NO");
                }
            }
        }catch (Exception e){

        }
    }
}
