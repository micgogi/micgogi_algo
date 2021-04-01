package LCMarch21Challenge;

/**
 * @author Micgogi
 * on 4/21/2020  12:27 PM
 * Rahul Gogyani
 */
public class LC268 {
    public static void main(String[] args) {
        int a[] = {9,6,4,2,3,5,7,0,1};
        int n = a.length+1;
        int sum =n*(n-1)/2;
        for (int i = 0; i <a.length ; i++) {
            sum-=a[i];
        }
        System.out.println(sum);
    }
}
