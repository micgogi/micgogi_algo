/*
 *@author Rahul Gogyani
 *
 * 9:09 AM 2/14/2020
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LC53 {
    public static void main(String[] args) {
       try {
           BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
           int n= Integer.parseInt(br.readLine());
           int[] a= new int[n];
           for (int i = 0; i <n ; i++) {
               a[i]=Integer.parseInt(br.readLine());
           }
          
           int maxSum = a[0];
           int windowSum = a[0];


           for (int i = 1; i < a.length; i++) {
               windowSum =Math.max(a[i],a[i]+windowSum);
               maxSum = Math.max(maxSum, windowSum);
           }
           System.out.println(maxSum);
       }catch (Exception e){
            e.printStackTrace();
       }
    }
}
