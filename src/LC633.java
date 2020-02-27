/**
 * @author Micgogi
 * on 2/27/2020  10:46 PM
 * Micgogi
 */
public class LC633 {
    public static void main(String[] args) {
        int n = 5;

        System.out.println(judgeSquareSum(n));

    }
    public static boolean judgeSquareSum(int c) {
        int i =0;

        int j =(int)Math.sqrt(c);

        while(i<=j){
            int sum =i*i+j*j;
            if(sum==c){
                return true;

            }else if(c>sum){
                i++;

            }else{
                j--;
            }
        }

        return false;
    }

}
