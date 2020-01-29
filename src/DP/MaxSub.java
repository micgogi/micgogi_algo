package DP;/*
 *@author Rahul Gogyani
 *
 * 11:54 AM 1/29/2020
 */

public class MaxSub {
    public static void main(String[] args) {
        int a[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSub(a));
    }
    public  static int maxSub(int a[]){
        int maxs=a[0];
        int maxend = a[0];
        for (int i = 0; i <a.length ; i++) {
                maxend = Math.max(maxend+a[i],a[i]);
                maxs = Math.max(maxs,
                        maxend);
        }
        return maxs;
    }
}
