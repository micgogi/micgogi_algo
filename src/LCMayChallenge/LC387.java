package LCMayChallenge;

/**
 * @author Micgogi
 * on 5/5/2020  1:38 PM
 * Rahul Gogyani
 */
public class LC387 {
    public static void main(String[] args) {
        String s = "atanki";
        int a[] = new int[26];
        for (int i = 0; i <s.length() ; i++) {
            a[s.charAt(i)-'a']++;
        }
        int index =0;
        for (int i = 0; i <s.length() ; i++) {
            if(a[s.charAt(i)-'a']==1){
                index=i;
                break;
            }
        }

        System.out.println(index);

    }
}
