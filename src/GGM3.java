package DP;/*
 *@author Rahul Gogyani
 * Cross Prudct: (a2 * b3 – a3 * b2) * i + (a3 * b1 – a1 * b3) * j + (a1 * b2 – a2 * b1) * k
 * 10:38 AM 3/11/2020
 */

import java.util.Arrays;

public class GGM3 {
    public static void main(String[] args) {
        int a[] = {65, 78, 75};
        int b[] = {73, 84, 65};
        System.out.println(dotProduct(a,b));
        System.out.println(Arrays.toString(crossProduct(a,b)));

    }

    public static int dotProduct(int a[], int b[]) {
        int mul = 0;
        if (a.length == b.length) {
            for (int i = 0; i < a.length; i++) {
                mul += a[i] * b[i];
            }
        }
        return mul;
    }
    public static int[] crossProduct(int a[], int b[]){

            int c[] = new int[a.length];
            c[0]=a[1]*b[2]-a[2]*b[1];
            c[1]=a[2]*b[0]-a[0]*b[2];
            c[2]=a[0]*b[1]-a[1]*b[0];
            return c;



    }
}
