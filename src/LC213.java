/**
 * @author Micgogi
 * on 6/4/2020  11:57 AM
 * Rahul Gogyani
 */
public class LC213 {
    public static void main(String[] args) {
        int a[] = {2};
        if(a.length==0) {
            System.out.println(0);
            return;
        }
        if(a.length==1){
            System.out.println(a[0]);
            return;
        }
        int dp[] = new int[a.length+1];
        dp[0]=0;
        dp[1]=a[0];
        for (int i = 1; i <a.length-1; i++) {
            dp[i+1] = Math.max(dp[i],dp[i-1]+a[i]);
        }
        int dp1[] = new int[a.length+1];
        dp1[0] = 0;
        dp1[2]=a[1];
        for (int i = 2; i <a.length; i++) {
            dp1[i+1] = Math.max(dp1[i],dp1[i-1]+a[i]);
        }
        System.out.println(Math.max(dp[a.length],dp1[a.length]));
    }
}
