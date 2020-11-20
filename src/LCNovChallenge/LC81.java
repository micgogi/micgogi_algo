package LCNovChallenge;

/**
 * @author Micgogi
 * on 4/11/2020  3:26 PM
 * Rahul Gogyani
 */
public class LC81 {
    public static void main(String[] args) {
        int a[] = {2,5,6,0,0,1,2};
        int left = 0;
        int right = a.length - 1;
        int target = 3;
        while(left<right&&a[left]==a[right]){
            right--;

        }
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (target == a[mid]) {
                System.out.println(true);
                return;
            }
            if (a[mid] < a[left]) {
                if (target < a[mid] || target >= a[left]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }

            } else {
                if (target > a[mid] || target < a[left]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        System.out.println(false);
        return;
    }
}
