package DP;/*
 *@author Rahul Gogyani

 *
 * 11:38 AM 3/11/2020
 */

import java.util.Arrays;
import java.util.HashMap;

public class LC136 {
    public static void main(String[] args) {
        int a[] = {2,2,1};

       Arrays.sort(a);
        for (int i = 0; i <a.length-1 ; i+=2) {
            if(a[i]!=a[i+1]){
                System.out.println(a[i]);
                break;
            }
        }
       
    }
}
