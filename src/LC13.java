import java.util.Scanner;

/**
 * @author Micgogi
 * on 12/7/2019  3:34 PM
 * Micgogi
 */
public class LC13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(convertRomanToInt(s));
    }
    public static int convertRomanToInt(String s){
        int  flag =0;
        int sum=0;
        for (int i = s.length()-1; i >=0 ; i--) {
            if(s.charAt(i)=='I'){
                if (flag == 0) {
                    sum+=1;

                }else{
                    sum-=1;
                }
            }else if(s.charAt(i)=='V'){
                if(flag<=1){
                    sum+=5;
                    flag=1;
                }else{
                    sum-=5;
                }
            }else if(s.charAt(i)=='X'){
                if(flag<=2){
                    sum+=10;
                    flag=2;
                }else{
                    sum-=10;
                }

            }else if(s.charAt(i)=='L'){
                if(flag<=3){
                    sum+=50;
                    flag=3;
                }else{
                    sum-=50;
                }

            }else if(s.charAt(i)=='C'){
                if(flag<=4){
                    sum+=100;
                    flag =4;
                }else{
                    sum-=100;
                }


            }else if(s.charAt(i)=='D'){
                if(flag<=5){
                    sum+=500;
                    flag=5;
                }else{
                    sum-=500;
                }

            }else if( s.charAt(i)=='M'){
                if(flag<=6){
                    sum+=1000;
                    flag=6;
                }else{
                    sum-=1000;
                }
            }
        }
        return sum;
    }
}
