/*
 *@author Rahul Gogyani
 *O(n)
 * 9:09 AM 2/14/2020
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MaxSumproblem {
    public static void main(String[] args) {
       try {
           BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
           int n= Integer.parseInt(br.readLine());
           int[] a= new int[n];
           for (int i = 0; i <n ; i++) {
               a[i]=Integer.parseInt(br.readLine());
           }
           int k =0;
           k = Integer.parseInt(br.readLine());
           int maxSum = 0;
           int windowSum = 0;
           for (int i = 0; i < k; i++) {
               windowSum += a[i];

           }
           for (int i = k; i < a.length; i++) {
               windowSum += a[i] - a[i - k];
               maxSum = Math.max(maxSum, windowSum);
           }
           System.out.println(maxSum);
       }catch (Exception e){
            e.printStackTrace();
       }
    }
}
