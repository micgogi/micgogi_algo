package LCJuneChallenge;/*
 *@author Rahul Gogyani
 *
 * 1:55 PM 2/19/2020
 */

import java.util.Arrays;
import java.util.HashMap;

public class LC75 {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int a[] = {2,0,2,1,1,0};
        for (int i = 0; i <a.length ; i++) {
            if(!map.containsKey(a[i])){
                map.put(a[i],1);
            }else{
                map.put(a[i],map.get(a[i])+1);
            }
        }
        int j=0;
        for (int i:map.keySet()){
            System.out.println(i+" "+map.get(i));
            for (int k = 0; k <map.get(i) ; k++) {
                a[j]=i;
                j++;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
