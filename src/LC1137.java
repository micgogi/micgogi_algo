/**
 * @author Micgogi
 * on 2/28/2020  11:15 PM
 * Micgogi
 */
public class LC1137 {
    public static void main(String[] args) {
        int f =0;
        int s = 1;
        int t=1;
        int N = 5;
        for (int i = 3; i <=N ; i++) {
                int l = f+s+t;
                f=s;
                s=t;
                t=l;
        }
        System.out.println(t);
    }
}
