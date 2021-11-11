/**
 * @author Micgogi
 * on 9/6/2020  12:07 PM
 * Rahul Gogyani
 */
public class LC5Test {
    public static void main(String args[]) {
        System.out.println(longestPalindrome("babad"));
    }

    public static String longestPalindrome(String s) {
        if(s==null||s.length()<1)return "";
        int start = 0;
        int end = 0;
        for (int i = 0; i <s.length() ; i++) {
            int len = Math.max(expandAroundCenter(s,i,i),expandAroundCenter(s,i,i+1));
            if(len>end-start){
                start = i-(len-1)/2;
                end = i+len/2;
            }
        }
        return s.substring(start,end+1);

    }
    private static int expandAroundCenter(String s, int left, int right){
        int L = left;
        int R = right;
        while (L>=0&&R<s.length()&&s.charAt(L)==s.charAt(R)){
            L--;
            R++;
        }
        return R-L-1;
    }
}

