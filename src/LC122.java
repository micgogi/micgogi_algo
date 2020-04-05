/**
 * @author Micgogi
 * on 4/5/2020  2:09 PM
 * Rahul Gogyani
 */
public class LC122 {
    public static void main(String[] args) {
        int a[] = {7,1,5,3,6,4};
        int max =0;

        for (int i = 1; i <a.length; i++) {

       if(a[i]>a[i-1]){
           max+=a[i]-a[i-1];
       }

        }
        System.out.println(max);
    }
}
