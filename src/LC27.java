/**
 * @author Micgogi
 * on 12/14/2019  7:14 PM
 * Micgogi
 */
public class LC27 {
    public int removeElement(int[] a, int val) {
        int j=0;
        for (int i = 0; i <a.length ; i++) {
            if(a[i]!=val){
                a[j]=a[i];
                j++;
            }
        }
        //System.out.println(Arrays.toString(a));
        return j;
    }
}
