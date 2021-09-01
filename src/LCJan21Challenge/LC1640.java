package LCJan21Challenge;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @author Micgogi
 * on 1/1/2021  2:49 PM
 * Rahul Gogyani
 */
public class LC1640 {
    public static void main(String args[]) {
        int[] arr = {65, 78, 75, 73, 84, 65};
        int[][] pieces = {{65}, {78}, {75}, {73}, {84}, {65}};
        System.out.println(canFormArray(arr, pieces));
    }

    public static boolean canFormArray(int[] arr, int[][] pieces) {
        HashMap<Integer, int[]> map = new HashMap<>();
        for (int[] piece : pieces) {
            map.put(piece[0], piece);
        }
        int[] res = new int[arr.length];
        int index = 0;
        for (int ele : arr) {
            if (map.containsKey(ele)) {
                for (int piece : map.get(ele)) {
                    res[index++] = piece;
                }
            }
        }
        return Arrays.equals(arr, res);
    }

}