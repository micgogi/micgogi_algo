package LCAugustChallenge;

import java.util.Arrays;

/**
 * @author Micgogi
 * on 8/17/2020  1:35 PM
 * Rahul Gogyani
 */
public class LC1103 {
    public static void main(String args[]) {
        int canides = 7;
        int num_people = 4;
        int a[] = new int[num_people];
        int count =1;
        while (canides>0){
            for (int i = 0; i < num_people; i++) {
                if(canides>=count){
                    a[i] += count;
                    canides-=count;
                    count++;
                }else {
                    a[i]+=canides;
                    canides=0;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}

