package LCJulyChallenge;

/**
 * @author Micgogi
 * on 2/28/2020  11:02 PM
 * Micgogi
 */
public class LC70 {
    public static void main(String[] args) {
        int n = 5;
        int j=1,k=2;
        for (int i = 3; i <=n ; i++) {
            int l = j+k;
            j=k;
            k=l;

        }
        System.out.println(k);
    }
}
