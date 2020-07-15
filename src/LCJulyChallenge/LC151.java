package LCJulyChallenge;/*
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
         System.out.println(rev(s));
    }
    
    //Optimized
    public static String rev(String s) {
        StringBuilder sb = new StringBuilder();
        int j = s.length()-1;
        while(j>=0){
            if(s.charAt(j)==' '){
                --j;
                continue;
            }
            int i = s.lastIndexOf(' ',j);
            sb.append(s.substring(i+1,j+1));
            j=i-1;
            sb.append(' ');


        }
        return sb.length()==0?"": sb.substring(0,sb.length()-1);

    }
}
