package Hashing;

import java.util.HashSet;

/**
 * @author Micgogi
 * on 12/28/2019  6:35 PM
 * Micgogi
 */
public class GH2_Hash {
    public static void main(String[] args) {
        int a1[] = {11, 1, 13, 21, 3, 7};
        int a2[] = {11, 3, 1};
        System.out.println(check(a1,a2));

    }

    public static boolean check(int a1[], int a2[]) {
        HashSet<Integer> h = new HashSet<>();
        for (int i = 0; i <a1.length ; i++) {
            if(!h.contains(a1[i]))h.add(a1[i]);
        }
        for (int i = 0; i < a2.length; i++) {
            if(!h.contains(a2[i]))return false;
        }
        return true;
    }
}