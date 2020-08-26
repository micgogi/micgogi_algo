package LCAugustChallenge;/*
 *@author Rahul Gogyani

 *
 * 1:03 PM 3/13/2020
 */

import java.util.ArrayList;
import java.util.List;

public class LC412 {
    public static void main(String[] args) {
        int n = 15;
        List<String> lsit = new ArrayList<>();
        for (int i = 1; i <=n ; i++) {
            if(i%3==0&&i%5==0){
                lsit.add("FizzBuzz");
            }else if(i%5==0){
                lsit.add("Buzz");
            }else if(i%3==0){
                lsit.add("Fizz");
            }else{
                lsit.add(""+i);
            }
        }
        System.out.println(lsit);
    }
}
