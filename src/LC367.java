/**
 * @author Micgogi
 * on 2/27/2020  10:09 PM
 * Micgogi
 */
public class LC367 {
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(36));
    }
    public static boolean isPerfectSquare(int num) {
        if(num==1)return true;
        long i = 2;
        long j = num/2;
        while (i<=j){
            long mid = (i+j)/2;
            if(mid*mid==num) {
                return true;
            }
            else if(mid*mid<num){
                i=mid+1;
            }
            else{
                j=mid-1;
            }

        }
        return false;

    }
}
