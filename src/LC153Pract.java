/**
 * @author Micgogi
 * on 6/19/2020  9:30 AM
 * Rahul Gogyani
 */
public class LC153Pract {
    public static void main(String[] args) {
        int a[] = {4, 5, 6, 7, 0, 1, 2};
        int left = 0;
        int right = a.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (mid > 0 && a[mid] < a[mid - 1]) {
                System.out.println(a[mid]);
                return;
            } else if (a[left] <= a[mid] && a[mid] > a[right]) {
                left = mid - 1;
            } else {
                right = mid + 1;
            }
        }
        System.out.println(a[left]);
    }
}
