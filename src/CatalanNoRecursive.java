/**
 * @author Micgogi
 * on 12/24/2019  6:22 PM
 * Micgogi
 */
public class CatalanNoRecursive {
    public static void main(String[] args) {
        for (int i = 0; i <10 ; i++) {
            System.out.print(catalanNo(i)+" ");
        }
    }
    public  static int catalanNo(int n){
        int  res =0 ;
        if(n<=1){
            return 1;

        }
        for (int i = 0; i <n ; i++) {
            res= res+ catalanNo(i)*catalanNo(n-i-1);
            
        }
        return res;
    }
}
