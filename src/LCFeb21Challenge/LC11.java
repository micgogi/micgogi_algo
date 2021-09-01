package LCFeb21Challenge;

/**
 * @author Micgogi
 * on 2/17/2021  2:39 PM
 * Rahul Gogyani
 */
public class LC11 {
    public static void main(String args[]) {
        int[] arr = {65, 78, 75, 73, 84, 65};
        System.out.println(maxArea(arr));
    }
    public static int maxArea(int[] a) {
        int max = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                max = Math.max(max, Math.min(a[i], a[j]) * (j - i));
            }
        }
        return max;
    }


}

