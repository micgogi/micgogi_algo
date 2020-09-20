package LCSeptChallenge;

/**
 * @author Micgogi
 * on 4/25/2020  12:40 PM
 * Rahul Gogyani
 */
public class LC980 {
    public static void main(String[] args) {
        int[][] grid ={{1,0,0,0},{0,0,0,0},{0,0,2,-1}};
        System.out.println(uniquePaths(grid));
    }

    public static int uniquePaths(int[][] grid){
        int m = grid.length;
        int n = grid[0].length;
        boolean visited[][] = new boolean[m][n];
        int start=-1,end=-1,count=0;
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j <n ; j++) {
                if(grid[i][j]==1){
                    start=i;
                    end=j;
                }
                if(grid[i][j]!=-1){
                    count++;
                }
            }
        }

        return helper( grid,visited, start, end,count);
    }

    public static int helper(int grid[][], boolean viisted[][],int start, int end, int count){
        int m = grid.length;
        int n = grid[0].length;
        if (start < 0 || start >=grid.length || end < 0 || end>=grid[0].length||
                grid[start][end]==-1||viisted[start][end]) {
            return 0;
        }
        if(grid[start][end]==2){
            if(count==1)
                return 1;
            else return 0;
        }
        viisted[start][end] = true;
        int a = helper(grid,viisted,start+1,end,count-1);
        int b = helper(grid,viisted,start,end+1,count-1);
        int c = helper(grid,viisted,start-1,end, count-1);
        int d = helper(grid,viisted,start,end-1,count-1);
        viisted[start][end]= false;
        return a+b+c+d;
    }
}
