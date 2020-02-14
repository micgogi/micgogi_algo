/*
 *@author Rahul Gogyani
 *
 * 4:06 PM 2/13/2020
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class LC345 {
    public static void main(String[] args) {
        
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String s = br.readLine();
            int b = 0;
            int e = s.length() - 1;
            char c[] = s.toCharArray();
            while (e >= b) {
                while (e >= b && isNotVowel(s.charAt(b))) {
                    b++;
                }
                while (e >= b && isNotVowel(s.charAt(e))) {
                    e--;
                }
                if (e >= b) {
                    char temp = c[b];
                    c[b] = c[e];
                    c[e] = temp;
                } else {
                    
                }
                b++;
                e--;


            }
            System.out.println(String.valueOf(c));

        }catch (Exception e){
            
        }
    }
    public  static boolean isNotVowel(char c) {

        return !(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U');
    }
}
