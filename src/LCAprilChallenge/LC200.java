package LCAprilChallenge;

/**
 * @author Micgogi
 * on 4/17/2020  3:38 PM
 * Rahul Gogyani
 */
public class LC200 {
    public static void main(String[] args) {
        char grid[][]={{'1','1','1','1','0'},
                {'1','1','0','1','0'},
                {'1','1','0','0','0'},
                {'0','0','0','0','0'}};
        int count=0;
        for (int i = 0; i <grid.length ; i++) {
            for (int j = 0; j <grid[0].length ; j++) {
                if(grid[i][j]=='1'){
                    count+=dfs(grid,i,j);
                }
            }
        }

        System.out.println(count);

    }

    public static int dfs(char[][] grid, int i, int j){
        if(i<0||i>=grid.length||j<0||j>=grid[i].length||grid[i][j]=='0'){
            return 0;
        }
        grid[i][j]='0';
        dfs(grid,i+1,j);
        dfs(grid,i-1,j);
        dfs(grid,i,j+1);
        dfs(grid,i,j-1);
        return 1;

    }
}
