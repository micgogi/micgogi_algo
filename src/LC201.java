/**
 * @author Micgogi
 * on 4/23/2020  12:39 PM
 * Rahul Gogyani
 */
public class LC201 {
    public static void main(String[] args) {
        int m = 5;
        int n = 10;
        int count =0;
        while(m!=n){
            m>>=1;
            n>>=1;
            count++;
        }
        System.out.println(m<<count);
    }
}
