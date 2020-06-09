package LCJuneChallenge;

/**
 * @author Micgogi
 * on 6/9/2020  12:54 PM
 * Rahul Gogyani
 */
public class LC369 {
    public static void main(String[] args) {
        String t= "nakiataaabbcdd";
        String s = "aate";
        int i=0,j=0;
        while(i<t.length()){
            if(s.charAt(j)==t.charAt(i)){
                j++;
                if(j==s.length()){
                    System.out.println("true");
                    return;
                }
            }
            i++;
        }
        System.out.println("false");
    }
}
