/**
 * @author Micgogi
 * on 4/11/2020  10:02 AM
 * Rahul Gogyani
 */
public class LC153 {
    public static void main(String[] args) {
        int a[] = {0,1,2,4,5,6,7};
        System.out.println(findMin(a));
    }

    public static int findMin(int[] a) {
        if(a.length==0)return -1;
        if(a.length==1)return a[0];
        int left = 0;
        int right = a.length-1;
        while (left<right){
            int mid = left+(right-left)/2;
            if(mid>0&&a[mid]<a[mid-1]){
                return a[mid];
            }else if(a[left]<=a[mid]&&a[mid]>a[right]){
                left=mid+1;
            }else {
                right = mid-1;
            }
        }
        return a[left];
    }
}
