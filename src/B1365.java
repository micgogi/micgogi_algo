import java.util.Scanner;

/**
 * @author Micgogi
 * on 6/29/2020  12:28 PM
 * Rahul Gogyani
 */
public class B1365 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            int a[] = new int[n];
            int b[] = new int[n];
            boolean have0 = false, have1=false,flag=true;
            for (int i = 0; i < a.length; i++) {
                a[i] = sc.nextInt();
                if(i>=1&&a[i]<a[i-1])
                    flag = false;
            }

            for (int i = 0; i < b.length; i++) {
                b[i] = sc.nextInt();
                if(b[i]==0)have0=true;
                else have1=true;

            }
            if(have0 && have1) System.out.println("Yes");
            else  if(flag) System.out.println("Yes");
            else System.out.println("No");


        }
    }
}
