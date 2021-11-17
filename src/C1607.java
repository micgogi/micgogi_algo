
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Micgogi
 * on 11/17/2021  12:26 PM
 * Rahul Gogyani
 */
public class C1607 {
    public static void main(String args[]) {
     Scanner sc=new Scanner(System.in);
        long t = sc.nextLong();
        while(t--!=0){
            int n= sc.nextInt();
            Long a[] = new Long[n];
            for (int i = 0; i <n ; i++) {
                a[i] = sc.nextLong();
            }
            Arrays.sort(a);
            long res = a[0];
            for (int i = 0; i <n-1 ; i++) {
                res = Math.max(res,a[i+1]-a[i]);
            }
            System.out.println(res);
        }
    }

}

