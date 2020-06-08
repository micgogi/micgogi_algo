/**
 * @author Micgogi
 * on 6/8/2020  8:59 AM
 * Rahul Gogyani
 */
public class LC115 {
    public static void main(String[] args) {
        String s = "takinaaaabbbsss";
        String t = "tinkaa";
        System.out.println(numOfDistinct(s,t));
    }

    public static int numOfDistinct(String s, String t){
        int[][] dp = new int[t.length()+1][s.length()+1];
        for (int i = 0; i <=s.length() ; i++) {
            dp[0][i]=1;
        }
        for (int i = 0; i <t.length() ; i++) {
            for (int j = 0; j <s.length() ; j++) {
                if(t.charAt(i)==s.charAt(j)){
                    dp[i+1][j+1] = dp[i][j]+dp[i+1][j];
                }else{
                    dp[i+1][j+1] = dp[i+1][j];
                }
            }
        }

        return dp[t.length()][s.length()];
    }
}
