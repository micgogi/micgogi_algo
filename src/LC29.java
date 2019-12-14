/**
 * @author Micgogi
 * on 12/14/2019  7:15 PM
 * Micgogi
 */
public class LC29 {
    public int divide(long dividend, long divisor) {

        long res =dividend/divisor;

        if(res>Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }
        if(res<Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        }
        return (int)res;

    }
}
