/**
 * @author Micgogi
 * on 6/3/2020  9:41 AM
 * Rahul Gogyani
 */
public class LC674 {
    public static void main(String[] args) {
        int a[] = {1,3,5,4,7};
        int len=1;
        int max=1;
        for (int i = 1; i <a.length ; i++) {
            if(a[i]>a[i-1]){
                len++;
                if(max<len){
                    max =len;
                }

            }else{
                len=1;
            }
        }
        System.out.println(max);
    }
}
