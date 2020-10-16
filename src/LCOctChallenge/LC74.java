package LCOctChallenge;

/**
 * @author Micgogi
 * on 4/22/2020  2:04 PM
 * Rahul Gogyani
 */
public class LC74 {
    public static void main(String[] args) {
        int a[][] = {{1,3,5,7},{10,11,16,20},{23,30,34,50}};
//        if(a.length==0||a[0].length==0) {
//
//            System.out.println(false);
//            return;
//        }
        int row = 0;
        int col =a[0].length-1;
        int target=11;
        while(row<a.length&&col>=0){
            if(target==a[row][col]){
                System.out.println(true);
                break;
            }
            if(target>a[row][col]){
                row++;
            }else{
                col--;
            }

        }
    }
}
