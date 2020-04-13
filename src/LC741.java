/**
 * @author Micgogi
 * on 4/13/2020  12:21 PM
 * Rahul Gogyani
 */
public class LC741 {
    public static void main(String[] args) {
        int a[][] = {{0,1,-1},{1,0,-1},{1,1,1}};
        for (int i = 1; i <a.length ; i++) {
            if(a[i][0]!=-1){
                a[i][0]+=a[i-1][0];
            }

        }
        for (int i = 1; i <a[0].length ; i++) {
            if(a[0][i]!=-1){
                a[0][i]+=a[0][i-1];
            }
        }

        for (int i = 1; i <a.length ; i++) {
            for (int j = 1; j <a[i].length ; j++) {
                if(a[i][j]!=-1){
                    a[i][j]+=Math.max(a[i-1][j],a[i][j-1]);
                }
            }
        }
        System.out.println(a[a.length-1][a[0].length-1]);
    }
}
