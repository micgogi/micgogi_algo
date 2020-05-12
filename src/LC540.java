/**
 * @author Micgogi
 * on 5/12/2020  1:40 PM
 * Rahul Gogyani
 */
public class LC540 {
    public static void main(String[] args) {
        int a[] = {3,3,7,7,10,11,11};
        int left = 0;
        int right = a.length-1;
        int n = a.length;
        while(left<right){
            int mid = left+(right-left)/2;
            if(a[mid]==a[mid^1]){
                left=mid+1;
            }else{
                right=mid;
            }

        }
        System.out.println(a[left]);
    }
}