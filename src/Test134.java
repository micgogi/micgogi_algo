/**
 * @author Micgogi
 * on 4/2/2020  4:34 PM
 * Rahul Gogyani
 */
public class Test134  {

    public static void main(String[] args) {
        int a[] = {5,5,10,100,10,5};
        System.out.println(findMaxSum(a));
    }
    static int findMaxSum(int a[]){
        int incl = a[0];
        int excl = 0;
        int excl_new;
        for (int i = 1; i < a.length; i++) {
            excl_new = (incl>excl)?incl:excl;
            incl=excl+a[i];
            excl = excl_new;
        }
        return (incl>excl)?incl:excl;
    }
}


