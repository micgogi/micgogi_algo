/**
 * @author Micgogi
 * on 6/18/2020  10:57 AM
 * Rahul Gogyani
 */
public class LC33Pract {
    public static void main(String[] args) {
        int a[] = {4, 5, 6, 7, 0, 1, 2};
        int left = 0;
        int right = a.length - 1;
        int target = 5;
        //find the pivot or smallest element
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (a[mid] > a[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        int start = left;
        left = 0;
        right = a.length - 1;
        if (target >= a[start] && target <= a[right]) {
            left = start;
        } else {
            right = start;
        }
        int ans = -1;
        while (left<=right){
            int mid = left+(right-left)/2;
            if(a[mid]==target){
              ans = mid;
                System.out.println(ans);
              return;
            }
            else if(a[mid]<target){
                left = mid+1;
            }
            else {
                right = mid-1;
            }
        }
        System.out.println(ans);

    }
}
