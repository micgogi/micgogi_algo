package DP;/*
 *@author Rahul Gogyani

 *
 * 12:01 PM 3/11/2020
 */

import java.util.HashMap;

public class Lc287 {
    public static void main(String[] args) {
        int a[] = {1,3,4,2,2};
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i <a.length ; i++) {
            if(map.containsKey(a[i])) {
                System.out.println(a[i]);
                break;
            }
            map.put(a[i],0);
        }
    }
}
