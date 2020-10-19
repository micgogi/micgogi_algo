/*
 *@author Rahul Gogyani
 *
 * 2:41 PM 2/7/2020
 */


public class NQueenProblem {
    static class Position{
        int row, col;
        Position(int row, int col){
            this.row = row;
            this.col = col;
        }
    }
    public static Position[] solveNQueen(int n){
            Position[] positions = new Position[n];
            boolean sol = solveNQueenUtil(n,0,positions);
            if(sol)return positions;
            else  return new Position[0];
    }
    public static boolean solveNQueenUtil(int n,int row,Position[] positions){
        if(n==row)return true;
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
                if(solveNQueenUtil(n,row+1,positions)){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        for (Position p : solveNQueen(4)){
            System.out.println(p.col+" "+p.row);
        }

    }
}
