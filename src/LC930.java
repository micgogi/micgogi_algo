
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Inet4Address;
import java.util.HashMap;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 8/8/2020  4:23 PM
 * Rahul Gogyani
 */
public class LC930 {
    public static void main(String args[]) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int a[] = {1,0,1,0,1};
        int curSum =0;
        int target = 2;
        int res = 0;
        for (int i = 0; i <a.length; i++) {
            curSum+=a[i];
            if(map.containsKey(curSum-target)){
                res+=map.getOrDefault(curSum-target,0);
            }
            map.put(curSum,map.getOrDefault(curSum,0)+1);
        }
        System.out.println(res);
    }


}

