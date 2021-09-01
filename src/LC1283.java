

/**
 * @author Micgogi
 * on 11/6/2020  7:31 PM
 * Rahul Gogyani
 */
public class LC1283 {
    public static void main(String args[]) {
        int a[] = {1, 2, 5, 9};
        int threshold = 6;
        int left = 1;
        int right = (int) 10e6;
        while(left <right){
            int mid = left+(right-left)/2;
            int sum = 0;
            for(int i: a){
                sum+=(i+mid-1)/mid;//(int) Math.ceil( i /(float) mid);
            }
            if(sum>threshold)left=mid+1;
            else right = mid;
        }
        System.out.println(left);
    }
}

