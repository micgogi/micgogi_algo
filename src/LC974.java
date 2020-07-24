import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 7/24/2020  10:23 AM
 * Rahul Gogyani
 */
public class LC974 {
    public static void main(String args[]) {
        int a[] = {4, 5, 0, -2, -3, 1};
        int k = 5;
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(0,1);
        int sum =0;
        int count =0;
        for (int i = 0; i <a.length ; i++) {


           // System.out.println((sum+a[i])%k);
            sum = (sum+a[i])%k;
            if(sum<0)sum+=k;
            count+=hm.getOrDefault(sum,0);
            hm.put(sum,hm.getOrDefault(sum,0)+1);
        }
        System.out.println(count);

    }


}

