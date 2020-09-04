/**
 * @author Micgogi
 * on 4/2/2020  4:34 PM
 * Rahul Gogyani
 */
public class Test134  {

    public static void main(String[] args) {
       String s = "ABAACDD";



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



