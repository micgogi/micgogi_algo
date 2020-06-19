import java.util.Arrays;

/**
 * @author Micgogi
 * on 6/19/2020  9:36 AM
 * Rahul Gogyani
 */
public class LC34 {
    public static void main(String[] args) {
        int a[] = {5, 7, 7, 8, 8, 10};
        int target = 8;
        int left = 0;
        int right = a.length-1;
        int first =-1;
        while(left<=right){
            int mid = left+(right-left)/2;

            if(a[mid]>=target){
                right = mid-1;
            }else{
                left = mid+1;
            }
            if(a[mid]==target){
                first = mid;
            }
        }
        System.out.println(first);
        left = 0;
        right = a.length-1;
        int second = -1;
        while(left<=right){
            int mid = left+(right-left)/2;

            if(a[mid]<=target){
                left = mid+1;
            }else{
                right = mid-1;
            }
            if(a[mid]==target){
                second= mid;
            }
        }
        System.out.println(second);
        int res[] = new int[]{first,second};
        System.out.println(Arrays.toString(res));

    }
}
