import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Micgogi
 * on 4/10/2020  10:17 AM
 * Rahul Gogyani
 */
public class LC38 {
    public static void main(String[] args) {
        String num="1";
        int n =3;
        for (int i = 1; i <n ; i++) {
         int count =1;
         String temp ="";
            for (int j = 1; j < num.length(); j++) {
                if(num.charAt(j)!=num.charAt(j-1)){
                    temp = temp + count+num.charAt(j-1);
                    count =1;

                }else{
                    count++;
                }

            }

            temp = temp+count+num.charAt(num.length()-1);
            num = temp;

        }
        System.out.println(num);
    }
}
