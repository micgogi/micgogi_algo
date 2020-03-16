import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Micgogi
 * on 11/18/2019  1:11 AM
 *
 */
public class LC4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int a[] = new int[n1];
        for (int i = 0; i < n1; i++) {
            a[i]= sc.nextInt();
        }
        int n2 = sc.nextInt();
        int b[] = new int[n2];
        for (int i = 0; i <n2 ; i++) {
            b[i]=sc.nextInt();
        }
        int c[] = new int[n1+n2];
        int k=0;
        for (int i = 0; i < n1; i++) {
            c[k++]=a[i];
        }
        for (int i = 0; i <n2 ; i++) {
            c[k++]=b[i];

        }
        Arrays.sort(c);
        System.out.println(Arrays.toString(c));
        if(c.length%2==0){
            int m = c[c.length/2-1]+c[c.length/2];
            System.out.println(m);
            System.out.println((double) m/2);
        }else{
            System.out.println(c[c.length/2]);
        }
    }
}
