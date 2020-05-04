package LCMayChallenge;

/**
 * @author Micgogi
 * on 5/4/2020  2:41 PM
 * Rahul Gogyani
 */
public class LC476 {
    public static void main(String[] args) {
        int n =8;
        int t=1;
       while(n>t){
           t=2*t+1;
       }
        System.out.println(n^t);

    }
}
