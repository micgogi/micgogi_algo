/**
 * @author Micgogi
 * on 4/21/2020  11:18 AM
 * Rahul Gogyani
 */
public class LC137 {
    public static void main(String[] args) {
        int a[] = {2,2,3,2,1,1,1};
        System.out.println(singleNumber(a));
    }

    public static int singleNumber(int a[]){
        int ones=0, twos=0;
        for (int i = 0; i <a.length ; i++) {
            ones = (ones^a[i])&~twos;
            twos = (twos^a[i])&~ones;

        }
        return ones;
    }
}
