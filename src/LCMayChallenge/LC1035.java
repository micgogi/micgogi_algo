package LCMayChallenge;

/**
 * @author Micgogi
 * on 5/25/2020  3:15 PM
 * Rahul Gogyani
 */
public class LC1035 {
    public static void main(String[] args) {
        int A[] = {1,4,2};
        int B[] = {1,2,3};
        System.out.println(maxUncrossedLines(A,B));
    }

    public static int maxUncrossedLines(int[] A, int[] B) {
        int dp[][] = new int[A.length+1][B.length+1];

        for(int i=1;i<=A.length;i++){
            for(int j=1;j<=B.length;j++){
                if(A[i-1]==B[j-1]){
                    dp[i][j]=1+dp[i-1][j-1];
                }else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }

        return dp[A.length][B.length];
    }
}
