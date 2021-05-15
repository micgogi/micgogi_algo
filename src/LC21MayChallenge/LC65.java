package LC21MayChallenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 5/15/2021  4:12 PM
 * Rahul Gogyani
 */
public class LC65 {
    public static void main(String args[]) {
        System.out.println(isNumber("36482737"));
    }

     static boolean isNumber(String s) {
        s = s.trim();
        boolean foundDecimal = false;
        boolean number = false;
        boolean foundE= false;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)>='0' && s.charAt(i)<='9'){
                number = true;
            }else if(s.charAt(i)=='.'){
                if(foundE||foundDecimal)return false;
                foundDecimal = true;
            }else if(s.charAt(i)=='e' || s.charAt(i)=='E'){
                if(foundE || !number)return false;
                number = false;
                foundE = true;
            }else if(s.charAt(i)=='-' || s.charAt(i)=='+'){
                if(i != 0 && s.charAt(i-1) != 'e')
                    return false;
            }else{
                return false;
            }
        }
        return number;
    }

}

