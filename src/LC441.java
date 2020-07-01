import java.util.Scanner;

/**
 * @author Micgogi
 * on 7/1/2020  12:54 PM
 * Rahul Gogyani
 */
public class LC441 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       int left =0;
       int right = n;
       long mid;
       long curr;
       while(left<=right){
           mid =(int)(left+(right-left)/2);
           curr = mid*(mid+1)/2;
           if(curr==n){
               System.out.println(mid);
               return;
           }
           if(n<curr){
               right = (int)mid-1;

           }else{
               left = (int) mid+1;
           }
       }
        System.out.println(right);
    }


}
