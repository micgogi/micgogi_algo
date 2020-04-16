/**
 * @author Micgogi
 * on 4/16/2020  3:12 PM
 * Rahul Gogyani
 */
public class LC152 {
    public static void main(String[] args){
        int a[] = {3,-1,4,3,7};
        int max = Integer.MIN_VALUE;
        int pr = 1;
        int n  = a.length;
        for (int i = 0; i < a.length; i++) {
            max = Math.max(pr*=a[i],max);
            if(a[i]==0)pr=1;
        }
        pr=1;
        for (int i = a.length-1; i >=0 ; i--) {
            max = Math.max(pr*=a[i],max);
            if(a[i]==0)pr=1;
        }
        System.out.println(max);
        
    }

   

}
