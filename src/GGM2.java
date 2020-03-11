/*
 *@author Rahul Gogyani
 *https://www.geeksforgeeks.org/calculate-discriminant-value/
 * 10:31 AM 3/11/2020
 */

public class GGM2 {
    public static void main(String[] args) {
        int a=65;
        int b = 78;
        int c = 75;
         int D=(int) Math.pow(b,2)- 4*a*c;
         if(D>0){
             System.out.println("Two Solutions possible");
         }
         else if(D==0){
             System.out.println("One Solution");
         }
         else{
             System.out.println("No Real Solution");
         }
    }
}
