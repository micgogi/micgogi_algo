import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author Micgogi
 * on 7/6/2020  12:44 PM
 * Rahul Gogyani
 */
public class LC66 {
    public static void main(String[] args) {
        int a[] = {9,9,9};
        int carry =0;
        for (int i = a.length-1; i>=0 ; i--) {
            if(a[i]==9){
                a[i]=0;
                carry++;
                if(carry==a.length){
                    int b[] = new int[a.length+1];
                    b[0] = 1;
                    System.out.println(Arrays.toString(b));
                    return;
                }
            }else{
                a[i]=a[i]+1;
                break;
            }
        }
        System.out.println(Arrays.toString(a));
    }

}
