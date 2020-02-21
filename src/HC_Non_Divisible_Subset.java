package DP;/*
 *@author Rahul Gogyani
 *
 * 4:13 PM 2/21/2020
 */

public class HC_Non_Divisible_Subset {
    public static void main(String[] args) {
        int arr[] = {1, 3, 2, 4};
        int n = arr.length;
        int k = 3;
        int ans = 1;
        int[] r = new int[k];
        for(int val:arr){
            int rem = val%k;
            r[rem]++;
        }
        if(k%2==0){
            r[k/2]=Math.min(r[k/2],1);

        }
        ans=Math.min(r[0],1);
        for (int i = 1; i <=k/2 ; i++) {
            ans+=Math.max(r[i],r[k-i]);
        }
        System.out.println(ans);
    }
}

