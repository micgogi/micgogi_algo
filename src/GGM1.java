/*
 *@author Rahul Gogyani
 *https://www.geeksforgeeks.org/linear-diophantine-equations/
 * 10:02 AM 3/11/2020
 */

public class GGM1 {
    public static void main(String[] args) {
        int a =3,b=6,c=9;
        if(ispossible(a,b,c)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
    static int gcd(int a, int b){
        if(a%b==0)return b;
        return gcd(b,a%b);
    }
    static boolean ispossible(int a, int b, int c){
        return (c%gcd(a,b)==0);
    }
}
