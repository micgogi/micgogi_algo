import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Inet4Address;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Micgogi
 * on 5/11/2020  10:50 AM
 * Rahul Gogyani
 */
public class C1335 {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t= Integer.parseInt(br.readLine());
            while(t--!=0){
                int n = Integer.parseInt(br.readLine());
                String s[] = br.readLine().split(" ");
                int a[] = new int[n];
                int max =0;
                Set<Integer> set = new HashSet<>();
                for (int i = 0; i <a.length ; i++) {
                    a[i]=Integer.parseInt(s[i]);
                    set.add(a[i]);
                    if(a[i]>max){
                        max = a[i];

                    }
                }
                int diffElemnts = set.size();
                int[] count = new int[max+1];
                for (int i = 0; i <a.length ; i++) {
                    count[a[i]]++;
                }
                int maxCount=0;
                for (int i = 0; i <count.length ; i++) {
                    if(count[i]>maxCount)maxCount=count[i];
                }
                System.out.println(Math.max(Math.min(diffElemnts-1,maxCount),Math.min(diffElemnts,maxCount-1)));


            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
