import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 7/28/2020  11:14 AM
 * Rahul Gogyani
 */
public class LC537 {
    public static void main(String args[]) {
        String s1 = "1+1i";
        String s2 = "1+1i";
        String firstNum[] = s1.split("\\+");
        String secondNum[] = s2.split("\\+");
        int firstReal = 0, firsImg = 0;
        int secondReal = 0, secondImg = 0;
        firstReal = Integer.parseInt(firstNum[0]);
        firsImg = Integer.parseInt(firstNum[1].replace("i", ""));
        secondReal = Integer.parseInt(secondNum[0]);
        secondImg = Integer.parseInt(secondNum[1].replace("i", ""));
        int real = (firstReal * secondReal) - (firsImg * secondImg);
        int img = (firstReal*secondImg)+(firsImg*secondReal);
        System.out.println(real+"+"+img+"i");

    }

}

