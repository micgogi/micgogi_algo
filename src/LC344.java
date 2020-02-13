/*
 *@author Rahul Gogyani
 *
 * 3:46 PM 2/13/2020
 */

import java.util.ArrayList;
import java.util.Arrays;

public class LC344 {
    public static void main(String[] args) {
        char c[] = {'h','e','l','l','o'};
        for (int i = 0; i <c.length/2 ; i++) {
            char temp = c[i];
            c[i]=c[c.length-1-i];
            c[c.length-i-1]=temp;

        }
        System.out.println(Arrays.toString(c));


    }
}
