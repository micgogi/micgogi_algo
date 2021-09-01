package LCApr21Challenge;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * @author Micgogi
 * on 4/30/2021  8:18 PM
 * Rahul Gogyani
 */
public class LC970 {
    public static void main(String args[]) {
        System.out.println(powerfulIntegers(2,3,10));
    }

    public static List<Integer> powerfulIntegers(int x, int y, int bound) {
        int i =1;
        HashSet<Integer> set = new HashSet<>();

        while(i<bound){
            int j=1;
            while(i+j<=bound){
                set.add(i+j);
                if(y==1)break;
                j*=y;
            }
            if(x==1)break;
            i*=x;
        }
        return new ArrayList<>(set);
    }

}

