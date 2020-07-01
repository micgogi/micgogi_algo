import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Micgogi
 * on 7/1/2020  11:02 AM
 * Rahul Gogyani
 */
public class A405 {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i <n ; i++) {
                a[i] = sc.nextInt();
            }
            Arrays.sort(a);
            for (int i = 0; i<a.length ; i++) {
                System.out.print(a[i]+" ");
            }

        }catch (Exception e){

        }
    }
}
