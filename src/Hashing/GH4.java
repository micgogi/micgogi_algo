package Hashing;

import java.util.HashSet;

/**
 * @author Micgogi
 * on 12/29/2019  11:51 AM
 * Micgogi
 */
public class GH4 {
    public static void main(String[] args) {
        int a[] = {1, 4, 45, 6, 10, 8};

printPair(a,16);

    }
    static void printPair(int a[], int sum){
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i <a.length ; i++) {
            int temp = sum - a[i];
            if(hs.contains(temp)){
                System.out.println(temp+" "+a[i]);
            }
            hs.add(a[i]);
        }
    }
}
