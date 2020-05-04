import javafx.animation.ScaleTransition;
import org.omg.CORBA.INTERNAL;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Micgogi
 * on 5/4/2020  11:09 AM
 * Rahul Gogyani
 */
public class A158{
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String s[] = br.readLine().split(" ");
            int n = Integer.parseInt(s[0]);
            int k = Integer.parseInt(s[1]);
            String s1[] = br.readLine().split(" ");
            int a[] = new int[n];
            for (int i = 0; i <n ; i++) {
                a[i]=Integer.parseInt(s1[i]);
            }
            int count=0;
            for (int i = 0; i <a.length ; i++) {
                if(a[i]>0&&a[i]>=a[k-1]){
                    count++;
                }
            }
            System.out.println(count);

        }catch (Exception e){

        }
    }
}
