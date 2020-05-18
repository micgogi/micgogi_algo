package LCMayChallenge;

/**
 * @author Micgogi
 * on 5/18/2020  12:48 PM
 * Rahul Gogyani
 */
public class LC567 {
    public static void main(String[] args) {
        String s2 = "kiantabahdvnfnfn";
        String s1= "an";
        System.out.println(checkInclusion(s1,s2));
    }


    public static boolean checkInclusion(String s1, String s2) {
        int c[] = new int[26];
        int count =0;
        for (int i = 0; i <s1.length() ; i++) {
            c[s1.charAt(i)-'a']++;

        }
        int left =0;
        int right =0;
        count = s1.length();
        while(right<s2.length()){
            if(c[s2.charAt(right++)-'a']-->=1)count--;
            if(count==0){
                return true;
            }
            if(right-left==s1.length()&&c[s2.charAt(left++)-'a']++>=0)count++;
        }
        return false;
    }
}
