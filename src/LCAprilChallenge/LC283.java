package LCAprilChallenge;

/**
 * @author Micgogi
 * on 5/1/2020  9:09 PM
 * Rahul Gogyani
 */
public class LC283 {
    public void moveZeroes(int[] a) {
        for (int i = 0; i <a.length-1 ; i++) {
            for (int j = i+1; j <a.length ; j++) {
                if(a[i]==0){
                    int temp = a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
    }
}
