/**
 * @author Micgogi
 * on 4/25/2020  2:03 PM
 * Rahul Gogyani
 */
public class LC55 {
    public static void main(String[] args) {
        int a[] ={2,0};
        System.out.println(canJump(a));
    }

    public static boolean canJump(int[] a) {
        int lastIndex=a.length-1;
        for (int i = a.length-1; i >=0 ; i--) {
            if(i+a[i]>=lastIndex){
                lastIndex=i;
            }
        }
        return lastIndex==0;
    }
}
