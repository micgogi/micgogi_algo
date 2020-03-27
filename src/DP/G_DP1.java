package DP;
/*
 *@author Rahul Gogyani
 * 11:27 AM 12/13/2019
 */

public class G_DP1 {
    public static void main(String[] args) {
        int a[] = new int[50];
        System.out.println(uglyNumber(10));
    }
    public  static int uglyNumber(int n){
        int ugly[] = new int[n];
        int i2=0,i3=0,i5=0;
        int nextMul2 = 2;
        int nextMul3=3;
        int nextMul5=5;
        int nextUglyNo =1;
        ugly[0]=1;
        for (int i = 1; i <n ; i++) {
            nextUglyNo= Math.min(nextMul2,Math.min(nextMul3,nextMul5));
            ugly[i]=nextUglyNo;
            if(nextUglyNo==nextMul2){
                i2=i2+1;
                nextMul2= ugly[i2]*2;
            }
            if(nextUglyNo==nextMul3){
                i3=i3+1;
                nextMul3=ugly[i3]*3;
            }
            if(nextUglyNo==nextMul5){
                i5=i5+1;
                nextMul5 = ugly[i5]*5;

            }
            
        }
        return nextUglyNo;
    }
}
