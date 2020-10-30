package LCOctChallenge;

import java.util.Arrays;

/**
 * @author Micgogi
 * on 6/3/2020  8:50 AM
 * Rahul Gogyani
 */
public class LC673 {
    public static void main(String[] args) {
        int a[] = {2, 2, 2, 2, 2};
        int dp[] = new int[a.length];
        int count[] = new int[a.length];
        int max = 0;
        Arrays.fill(dp, 1);
        Arrays.fill(count,1);
        for (int i = 1; i <a.length ; i++) {
            for (int j = 0; j <i ; j++) {
                if(a[i]>a[j]) {
                    if (dp[j] + 1 > dp[i]) {
                        dp[i] = dp[j] + 1;
                        count[i]=count[j];
                    }else if(dp[i]==dp[j]+1){
                        count[i]+=count[j];
                    }
                }
            }
            if(dp[i]>max){
                max=dp[i];
            }
        }

        System.out.println(max);

        System.out.println(Arrays.toString(dp));

        System.out.println(Arrays.toString(count));
        int count1=0;
        for (int i = 0; i <count.length ; i++) {
            if(max==dp[i]){
                count1+=count[i];
            }
        }
        System.out.println(count1);
    }
}
