import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 7/24/2020  2:25 PM
 * Rahul Gogyani
 */
public class LC713Pract {
    public static void main(String args[]) {
        int a[] = {10,5,2,6};
        int k =100;
        int left = 0;
        int right = 0;
        int prod =1;
        int count =0;
        while (right<a.length){
            prod*=a[right];
            while (prod>=k){
                prod/=a[left];
                left++;
            }
            count+=right-left+1;
            right++;
        }
        System.out.println(count);
    }


}

