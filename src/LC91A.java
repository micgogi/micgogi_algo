/**
 * @author Micgogi
 * on 4/17/2020  12:56 PM
 * Rahul Gogyani
 */
public class LC91A {
    public static void main(String[] args) {
        String s ="12";
        int dp[] = new int[s.length()+1];
        dp[0]=1;
        dp[1]=s.charAt(0)=='0'?0:1;
        for (int i = 2; i <=s.length() ; i++) {
            int singleDigit = Integer.parseInt(s.substring(i-1,i));
            int doubleDigit = Integer.parseInt(s.substring(i-2,i));
            if(singleDigit>=1){
                dp[i]+=dp[i-1];
            }
            if(doubleDigit>=10&&doubleDigit<=26){
                dp[i]+=dp[i-2];
            }
        }
        System.out.println(dp[s.length()]);
    }
}
