import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Micgogi
 * on 12/7/2019  9:33 PM
 * Micgogi
 */
public class LC14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s[] = new String[n];
        for (int i = 0; i <n ; i++) {
            s[i]= sc.next();
        }
        if(s.length==0) System.out.println("");;
        if(s.length==1) System.out.println( s[0]);
       int min=s[0].length();
        for (int i = 1; i <s.length ; i++) {
            if(s[i].length()<min){
                min=s[i].length();
            }
        }
        int j=0;
        boolean flag =false;
       StringBuilder sb = new StringBuilder();
        while (min--!=0){
            char c = ' ';
            for (int i = 1; i <s.length ; i++) {
                if(s[i-1].charAt(j)==s[i].charAt(j)){
                    flag = true;
                    c = s[i-1].charAt(j);
                }else{
                    flag=false;
                    break;
                }
            }
            if(flag){
                sb.append(c);
                j++;
            }else{
                System.out.println("HIIIII");
                break;
            }
        }
        System.out.println(sb.toString());
    }
}
