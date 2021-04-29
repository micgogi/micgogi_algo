package LCApr21Challenge;

/**
 * @author Micgogi
 * on 2/7/2020  9:53 PM
 * Micgogi
 */
public class LC63 {
    public static void main(String[] args) {
        int a[][] = {{0,0,0},{0,1,0},{0,0,0}};
        int count[][]= new int[a.length][a[0].length];
        for (int i = 0; i <a.length ; i++) {
            if(a[i][0]==0)
                count[i][0]=1;
        }
        for (int i = 0; i <a[0].length ; i++) {
            if(a[0][i]==0)
                count[0][i]=1;
        }
        for (int i = 1; i <a.length ; i++) {
            for (int j = 1; j <a[0].length ; j++) {
                if(a[i][j]==0){
                    count[i][j]=count[i-1][j]+count[i][j-1];
                }
            }
        }
        System.out.println(count[a.length-1][a[0].length-1]);

    }
}
