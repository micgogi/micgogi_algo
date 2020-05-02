import java.util.Arrays;

/**
 * @author Micgogi
 * on 5/2/2020  3:55 PM
 * Rahul Gogyani
 */
public class TEst45 {


    public static void main(String[] args) {
        int a[] = {1,1,1};
        int b[] = {1,2,3};
        int x[] = new int[a.length+2];
        for (int i = 0; i <a.length ; i++) {
            x[a[i]]++;
            x[b[i]+1]--;
        }
        System.out.println(Arrays.toString(x));
        for (int i = 0; i <x.length-1; i++) {
            x[i+1]+=x[i];
        }
        System.out.println(Arrays.toString(x));
    }
}
