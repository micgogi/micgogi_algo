package LCSeptChallenge;

/**
 * @author Micgogi
 * on 9/3/2020  6:11 PM
 * Rahul Gogyani
 */
public class LC459 {
    public static void main(String args[]) {
        String s = "abcabcabcab";
        System.out.println(repeatedSubstringPattern(s));

    }

    public static boolean repeatedSubstringPattern(String s){
        int n = s.length();
        for (int i = n/2; i >=1 ; i--) {
            if(n%i==0){
                String sub = s.substring(0,i);
                int time = n/i;
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j <time ; j++) {
                    sb.append(sub);
                }
                if(sb.toString().equals(s)){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean repeatedSubstringPattern1(String s) {
        String t = s+s;
        return t.substring(1,t.length()-1).contains(s);
    }


}

