package LCJuneChallenge;/*
 *@author Rahul Gogyani
 *
 * 1:48 PM 2/14/2020
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;


public class LC35 {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());
            int a[] = new int[n];
            for (int i = 0; i <n ; i++) {
                a[i]= Integer.parseInt(br.readLine());
            }
            int target = Integer.parseInt(br.readLine());
            System.out.println(searchInsert(a,target));
        }catch (Exception e){

        }
    }
    public static int searchInsert(int[] a, int target) {
        if(target<=a[0])return 0;

        for (int i = 0; i <a.length-1 ; i++) {
            if(a[i]==target){
                return i;
            }else if(target>a[i]&&a[i+1]>=target){
                return i+1;
            }
        }

        return a.length;
    }
}
