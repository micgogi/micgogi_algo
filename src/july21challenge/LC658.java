package july21challenge;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 7/2/2021  5:09 PM
 * Rahul Gogyani
 */
public class LC658 {
    public static void main(String args[]) {
        System.out.println(findClosestElements(new int[]{1,2,3,4,5},4,3));
    }
    public static List<Integer> findClosestElements(int[] arr, int k, int x) {
        int lo =0;
        int hi = arr.length-1;
        while (hi-lo>=k){
            if(Math.abs(arr[lo]-x)>Math.abs(arr[hi]-x)){
                lo++;
            }else {
                hi--;
            }
        }
        List<Integer> list = new ArrayList<>();
        for (int i = lo; i <=hi ; i++) {
            list.add(arr[i]);
        }
        return list;
    }


}

