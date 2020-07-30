/**
 * @author Micgogi
 * on 3/31/2020  3:02 PM
 * Rahul Gogyani
 */
public class LC79 {

    static int dx[] = {-1, 1, 0, 0};
    static int dy[] = {0, 0, -1, 1};

    public static void main(String[] args) {
        char a[][] = {{'A', 'B', 'C', 'E'},
                {'N', 'K', 'I', 'S'},
                {'A', 'D', 'T', 'A'}};

        System.out.println(check(a,"ANKITA"));


    }

    public static boolean check(char a[][], String word){
        for (int i = 0; i <a.length ; i++) {
            for (int j = 0; j <a[0].length ; j++) {
                if(backTracking(a,word,i,j,0))
                    return true;
            }
        }
        return false;
    }
    public static boolean backTracking(char a[][], String word, int i, int j, int index) {
        if (word.length() == index) return true;
        if (i < 0 || i >= a.length || j < 0 || j >= a[0].length || word.charAt(index) != a[i][j]) {
            return false;
        }
        boolean ret = false;
        a[i][j] = '*';
        for (int k = 0; k < 4; k++) {
            if (backTracking(a, word, i + dx[k], j + dy[k], index + 1)) {
                ret = true;
                break;
            }
        }
        a[i][j]=word.charAt(index);
        return  ret;
    }
}
