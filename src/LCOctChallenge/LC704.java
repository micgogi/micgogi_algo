package LCOctChallenge;

/**
 * @author Micgogi
 * on 10/8/2020  1:22 PM
 * Rahul Gogyani
 */
public class LC704 {
    public static void main(String args[]) {
        int a[] = {65, 78, 75, 73, 84, 65};
        int target = 65;
        System.out.println(search(a, target));
    }

    public static int search(int[] a, int target) {
        int left = 0, right = a.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (a[mid] == target) return mid;
            if (a[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}


