package LCDecChallenge;

import java.util.HashMap;

/**
 * @author Micgogi
 * on 12/17/2020  3:15 PM
 * Rahul Gogyani
 */
public class LC454 {
    public static void main(String args[]) {
        int A[] = {65, 78};
        int B[] = {75, -73};
        int C[] = {-65, 84};
        int D[] = {-75, -78};
        System.out.println(fourSum(A, B, C, D));
    }

    public static int fourSum(int A[], int B[], int C[], int D[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                int sum = A[i] + B[j];
                map.put(sum, map.getOrDefault(sum, 0) + 1);
            }
        }
        int res = 0;
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < D.length; j++) {
                res += map.getOrDefault(-1 * (C[i] + D[j]), 0);
            }
        }
        return res;
    }
}

