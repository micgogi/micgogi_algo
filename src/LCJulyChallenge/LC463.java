package LCJulyChallenge;

/**
 * @author Micgogi
 * on 7/7/2020  1:25 PM
 * Rahul Gogyani
 */
public class LC463 {
    static int di[] = {1,-1,0,0};
   static int dj[] = {0,0,1,-1};
    public static void main(String[] args) {
        int a[][] = {{0,1,0,0},
                {1,1,1,0},
                {0,1,0,0},
                {1,1,0,0}};
        int count =0;

        for (int i = 0; i <a.length ; i++) {
            for (int j = 0; j <a[i].length ; j++) {
                for (int k = 0; k <4 ; k++) {
                    if(a[i][j]==1){
                        int m = i+di[k];
                        int n = j+dj[k];

                        if(m<0||m>=a.length||n<0||n>=a[i].length||a[m][n]==0){
                            count++;
                        }

                    }
                }

            }
        }
        System.out.println(count);
    }
}
