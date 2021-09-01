package LCNovChallenge;

/**
 * @author Micgogi
 * on 11/16/2020  2:37 PM
 * Rahul Gogyani
 */
public class LC838 {
    public static void main(String args[]) {
        int a[] = {65, 78, 75, 73, 84, 65};
        System.out.println(longestMountain(a));
    }

    public static int longestMountain(int a[]) {
        int n = a.length;
        int res = 0;
        int[] down = new int[n];
        int[] up = new int[n];
        for (int i = n - 2; i >= 0; i--) {
            if (a[i] > a[i + 1]) down[i] = down[i + 1] + 1;
        }
        for (int i = 0; i < n; i++) {
            if (i > 0 && a[i] > a[i - 1]) up[i] = up[i - 1] + 1;
            if (up[i] > 0 && down[i] > 0) res = Math.max(res, down[i] + up[i] + 1);
        }
        return res;
    }
}

