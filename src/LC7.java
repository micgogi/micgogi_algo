import java.util.Scanner;

/**
 * @author Micgogi
 * on 12/3/2019  12:00 AM
 * 65 78 75 73 84 65
 */
public class LC7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev=0;
        while(n!=0){
            rev=rev*10+n%10;
            n=n/10;
        }
        System.out.println(rev);
    }
}
