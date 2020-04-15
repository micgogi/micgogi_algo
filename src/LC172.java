/**
 * @author Micgogi
 * on 4/15/2020  9:57 AM
 * Rahul Gogyani
 */
public class LC172 {
    public static void main(String[] args) {
        int n = 120;
        int count =0;

        while(n!=0){
           count+=n/5;
            n=n/5;
        }
        System.out.println(count);
    }
}
