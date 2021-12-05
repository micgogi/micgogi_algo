import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 12/5/2021  1:49 PM
 * Rahul Gogyani
 */
public class LC1010Test {
    public int numPairsDivisibleBy60(int[] time) {
        int[] count = new int[60];
        int ans =0;
        for(int i=0;i<time.length;i++){
            if(time[i]%60==0){
                ans+=count[0];
            }else{
                ans+=count[60-time[i]%60];
            }
            count[time[i]%60]++;
        }
        return ans;
    }
}

