import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Micgogi
 * on 1/11/2020  11:37 PM
 * Micgogi
 */
public class CC_CLEANUP {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t  = Integer.parseInt(br.readLine());
            while(t--!=0){
                String f = br.readLine();
                String s = br.readLine();
                String f1[] = f.split(" ");
                String s1[] = s.split(" ");
//                System.out.println(Arrays.toString(f1));
//                System.out.println(Arrays.toString(s1));
                int n = Integer.parseInt(f1[0]);
                int m = Integer.parseInt(f1[1]);
                int b[] = new int[m];
                int a[] = new int[n];
               // System.out.println(Arrays.toString(b));
                for (int i = 0; i <m ; i++) {
                    b[i]=Integer.parseInt(s1[i]);

                }
                Arrays.sort(b);
                //System.out.println(Arrays.toString(b));
                for (int i = 0; i <n ; i++) {
                    a[i]=i+1;

                }
              //  System.out.println(Arrays.toString(a));
                int j=0;
                for (int i = 0; i <a.length ; i++) {

                    if(j<b.length&&a[i]==b[j]){
                        a[i]=-1;
                        j++;
                    }
                }
                ArrayList<Integer> c = new ArrayList<>();
                ArrayList<Integer> as = new ArrayList<>();
                boolean flag = true;
                for (int i = 0; i <a.length ; i++) {
                    if(flag&&a[i]!=-1){
                        c.add(a[i]);
                        flag=false;
                    }else if(!flag&&a[i]!=-1){
                        as.add(a[i]);
                        flag=true;
                    }

                }
                for (int i = 0; i <c.size() ; i++) {
                    System.out.print(c.get(i)+" ");
                }
                System.out.println();
                for (int i = 0; i <as.size() ; i++) {
                    System.out.print(as.get(i)+" ");
                }
                System.out.println();
            }
        }catch (Exception e ){
          //  e.printStackTrace();
        }
    }
}
