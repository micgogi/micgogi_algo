package LCMayChallenge;

/**
 * @author Micgogi
 * on 5/8/2020  2:13 PM
 * Rahul Gogyani
 */
public class LC1232 {
    public static void main(String[] args) {
        int a[][] = {{1,2},{2,3},{3,4},{4,5},{5,6},{6,7}};
       int p1[] = a[1];
       int p2[] = a[0];

       float slope1=slope(p1,p2);
        for (int i = 1; i <a.length ; i++) {
                float slope2=slope(a[0],a[i]);
                if(slope1!=slope2){
                    System.out.println(false);
                   return;
                }
        }
        System.out.println(true);



    }

    public static float slope(int a[], int b[]){

        if(a[0]-b[0]==0)return 0;
        return (float) (b[1]-a[1])/(b[0]-a[0]);
    }

}
