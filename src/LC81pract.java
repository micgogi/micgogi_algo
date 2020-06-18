/**
 * @author Micgogi
 * on 6/18/2020  11:07 AM
 * Rahul Gogyani
 */
public class LC81pract {
    public static void main(String[] args) {
        int a[] = {2,5,6,0,0,1,2};
        int left = 0;
        int right = a.length-1;
        int target = 1;
        while(left<right&&a[left]==a[right])
            right--;
        int t = right;
        while (left<right){
            int mid = left+(right-left)/2;
            if(a[mid]>a[right]){
                left = mid+1;
            }else{
                right = mid;
            }
        }
        int start = left;
        left = 0;
        right = t;
        if(target>=a[start]&&target<=a[right]){
            left = start;
        }else{
            right = start;
        }
        while(left<=right){
            int mid = left+(right-left)/2;
            if(target==a[mid]){
                System.out.println(mid);
                return;
            }else if(target>a[mid]){
                left = mid+1;
            }else{
                right=mid-1;
            }
        }

    }
}
