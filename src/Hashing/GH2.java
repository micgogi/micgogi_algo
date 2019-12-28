package Hashing;

import java.util.Arrays;

/**
 * @author Micgogi
 * on 12/28/2019  6:28 PM
 * Micgogi
 */
public class GH2 {
    public static void main(String[] args) {
        int a[] = {11, 1, 13, 21, 3, 7};
        int b[] = {11, 3, 9, 1};
        System.out.println(checkSubset(a,b));
    }
    public static boolean checkSubset(int a[], int b[]){
        Arrays.sort(a);
        Arrays.sort(b);
        int i=0;
        int j=0;
        boolean flag = false;
        int l =Math.min(a.length,b.length);
       while (l!=0){
           if(a[i]==b[j]){
               i++;
               j++;
               l--;
               flag = true;
           }else {
               flag = false;
               l--;
           }

       }
       return  flag;
    }
}
