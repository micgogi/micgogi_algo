/**
 * @author Micgogi
 * on 4/17/2020  10:46 AM
 * Rahul Gogyani
 */
public class LC167 {
    public static void main(String[] args) {
        int a[] = {2,7,9,11};
        int target = 9;
        int l =0;
        int r = a.length-1;
        while (l<r){
            int sum = a[l]+a[r];
            if(sum==target){
             int b[] =  new int[]{l+1,r+1};
            }
            if(sum<target){
                l++;
            }else {
                r--;
            }
        }

    }
}
