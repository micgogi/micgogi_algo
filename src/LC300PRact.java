import java.util.Arrays;

/**
 * @author Micgogi
 * on 6/2/2020  4:04 PM
 * Rahul Gogyani
 */
public class LC300PRact {
    public static void main(String[] args) {
        int a[] = {3,4,-1,0,6,2,3};
        System.out.println(lcs(a));

    }



    //Time Complexity O(n*n)
    public static int lcs(int a[]){
        int dp[] = new int[a.length];
        for (int i = 0; i <dp.length ; i++) {
            dp[i] = 1;

        }

        for (int i = 1; i <a.length ; i++) {
            for (int j = 0; j <=i ; j++) {
                if(a[i]>a[j]){
                    if(dp[j]+1>dp[i]){
                        dp[i]=dp[j]+1;
                    }
                }

            }
        }
        return dp[dp.length-1];
    }
}
