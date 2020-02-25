/*
 *@author Rahul Gogyani
 *
 * 1:49 PM 2/25/2020
 */

public class LC151 {
    public static void main(String[] args) {
        String s = "Manyata is a Tech Park";
        String s2 ="";
        String s1[]=s.split(" ");
        System.out.println(s1.length);
        for (int i =s1.length-1; i >=0 ; i--) {
            if(!s1[i].equals("")) {
               s2=s2+" "+s1[i];
            }
        }
        System.out.println(s2.trim());
    }
}
