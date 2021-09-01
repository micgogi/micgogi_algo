package LC21MayChallenge;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Micgogi
 * on 5/29/2021  3:26 PM
 * Rahul Gogyani
 */
public class LC52 {


    static class Position{
        int row, col;
        Position(int row, int col){
            this.row = row;
            this.col = col;
        }
    }
    public static List<List<String>> solveNQueen(int n){
        List<List<String>> result =new ArrayList<>();
        Position[] positions = new Position[n];
        solveNQueenUtil(n,0,positions,result);
        return result;

    }
    public static void solveNQueenUtil(int n, int row, Position[] positions, List<List<String>> result){
        if(n==row){
            StringBuilder sb = new StringBuilder();
            List<String> l = new ArrayList<>();
            for(Position p:positions){
                for (int i = 0; i <n ; i++) {
                    if(p.col==i)sb.append("Q");
                    else{
                        sb.append(".");
                    }
                }
                l.add(sb.toString());
                sb = new StringBuilder();
            }
            result.add(l);
            return;
        }
        for (int col = 0; col <n ; col++) {
            boolean safe = true;
            for (int queen = 0; queen <row ; queen++) {
                if(positions[queen].col==col||positions[queen].row-positions[queen].col==row-col||positions[queen].row+positions[queen].col==row+col){
                    safe = false;
                    break;
                }
            }
            if (safe){
                positions[row] = new Position(row,col);
                solveNQueenUtil(n,row+1,positions,result);

            }
        }

    }
    public int totalNQueens(int n) {
        return solveNQueen(n).size();
    }


}

