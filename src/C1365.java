import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

/**
 * @author Micgogi
 * on 6/29/2020  1:40 PM
 * Rahul Gogyani
 */
public class C1365 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n+1];
        int b[] = new int[n+1];
        int c[] =  new int[n+1];
        for (int i = 0; i <n; i++) {
            a[sc.nextInt()] = i;
        }
        for (int i = 0; i <n ; i++) {
            b[sc.nextInt()] = i;
        }

        for (int i = 1; i <=n ; i++) {
            c[(n+a[i]-b[i])%n]++;
        }
        int ans = Arrays.stream(c).max().getAsInt();
        System.out.println(ans);


    }
}
