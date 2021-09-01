/**
 * @author Micgogi
 * on 12/10/2020  5:08 PM
 * Rahul Gogyani
 */
public class LC941 {
    public static void main(String args[]) {
        int a[] = {65, 73, 75, 78, 84, 65};
        System.out.println(validMountainArray(a));

    }

    public static boolean validMountainArray(int[] a) {
        int n = a.length;
        int left = 0;
        int right = n - 1;
        while (left + 1 < n && a[left] < a[left + 1]) ++left;
        while (0 <= right - 1 && a[right - 1] > a[right]) --right;
        return left == right && left != 0 && right != n - 1;
    }
}

