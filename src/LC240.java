
/**
 * @author Micgogi
 * on 4/22/2020  2:21 PM
 * Rahul Gogyani
 */
public class LC240 {
    public static void main(String[] args) {
        int a[][] ={{1,4,7,11,15},
                {2,5,8,12,19},
                {3,6,9,16,22},
                {10,13,14,17,24},
                {18,21,23,26,30}};
        int target = 13;
        int row = a.length;
        int col = a[0].length;
        int r =0;
        int c=a[0].length-1;
        while(r<row&&c>=0){
            if(a[r][c]== target){
                System.out.println(true);
                break;
            }

            if(target>a[r][c]){
               r++;
            }else{
                c--;
            }


        }
    }
}
