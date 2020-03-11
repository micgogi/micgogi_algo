/*
 *@author Rahul Gogyani

 *
 * 12:12 PM 3/11/2020
 */

import java.util.Arrays;

public class LC191 {
    public static void main(String[] args) {
        int a[] = {0,1,0,3,12};
        for (int i = 0; i <a.length-1 ; i++) {
            for (int j = i+1; j <a.length ; j++) {
                if(a[i]==0){
                    int temp = a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
