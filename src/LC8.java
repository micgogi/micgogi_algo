import java.util.Scanner;

/**
 * @author Micgogi
 * on 12/3/2019  12:18 AM
 *
 */
public class LC8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(myAtoi(s));


    }

        public static int myAtoi(String s) {
            s = s.trim();
            if(s.length()==0)return 0;

            long ans =0;
            int sign=0;
            boolean flag = false;
            for (int i = 0; i <s.length() ; i++) {
                char ch = s.charAt(i);
                if(i==0&&ch=='+'){
                    sign = 0;
                }else if(i==0&& ch =='-'){
                    sign = 1;
                }else if(Character.isDigit(ch)){
                    ans = ans*10+(int) (ch-'0');
                    if(ans>Integer.MAX_VALUE){
                        ans= Integer.MAX_VALUE;
                        flag = true;
                        break;
                    }

                }else{
                    break;
                }
            }
            if(sign==1){
                if(flag){
                    ans=Integer.MIN_VALUE;
                }else{
                    ans = ans*-1;
                }
            }
            return (int) ans;
        }



}
