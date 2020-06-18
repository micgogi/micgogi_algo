/**
 * @author Micgogi
 * on 6/18/2020  1:34 PM
 * Rahul Gogyani
 */
public class LC275 {
    public static void main(String[] args) {

        int a[] = {0, 1, 3, 5, 6};
        int left = 0;
        int right = a.length-1;
        int n = a.length;
        while(left<=right){
            int mid = left+(right-left)/2;
            if(a[mid]==n-mid){
                System.out.println(n-mid);
                return;
            }else if(a[mid]<n-mid){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
    }
}
