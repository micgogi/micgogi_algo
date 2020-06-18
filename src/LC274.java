import java.util.Arrays;

/**
 * @author Micgogi
 * on 6/18/2020  1:01 PM
 * Rahul Gogyani
 */
public class LC274 {
    public static void main(String[] args) {
        int a[] = {3,0,6,5,1};
        int n = a.length;
        int count[] = new int[n+1];
        for (int i = 0; i <a.length ; i++) {
            if(a[i]>=n){
                count[n]++;
            }else{
                count[a[i]]++;
            }
        }
        System.out.println(Arrays.toString(count));
        int total = 0;
        for (int i = n; i >=0 ; i--) {
            total+=count[i];
            if(total>=i){
                System.out.println(i);
                return;
            }
        }
        System.out.println(0);
    }
}
