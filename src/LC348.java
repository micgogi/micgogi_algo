import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 12/4/2021  12:31 PM
 * Rahul Gogyani
 */
public class LC348 {
    public static void main(String[] args) {

    }
    int[] row,col;
    int diagonal, antidiagonal;
    int n;
    public LC348(int n){
        row = new int[n];
        col = new int[n];
        this.n = n;
    }
    public int move(int i, int j, int player){
        int cplayer=player==1?1:-1;
        row[i]+=cplayer;
        col[j]+=cplayer;
        if(i==j){
            diagonal+=cplayer;
        }
        if(i==n-j-1){
            antidiagonal+=cplayer;
        }
        if(Math.abs(row[i])==n||Math.abs(col[j])==n||Math.abs(diagonal)==n||Math.abs(antidiagonal)==n){
            return player;
        }
        return 0;
    }

}

