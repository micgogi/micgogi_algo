import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 12/4/2021  3:40 PM
 * Rahul Gogyani
 */
public class LC1730 {
    public static void main(String[] args) {
        LC1730 lc1730 = new LC1730();
        System.out.println(lc1730.getFood(new char[][]{{'X', 'X', 'X', 'X', 'X'}, {'X', '*', 'X', 'O', 'X'}, {'X', 'O', 'X', '#', 'X'},
                {'X', 'X', 'X', 'X', 'X'}}));


    }

    public int[] findStartPoint(char[][] grid){
        for (int i = 0; i <grid.length ; i++) {
            for (int j = 0; j <grid[i].length ; j++) {
                if (grid[i][j]=='*')return new int[]{i,j};
            }
        }
        return new int[]{-1,-1};
    }

    public int getFood(char[][] grid) {
        int step =0;
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        int[] firstPoint = findStartPoint(grid);
        queue.add(firstPoint);
        visited[firstPoint[0]][firstPoint[1]]=true;
        int[][] dir = {{1,0},{-1,0},{0,1},{0,-1}};
        while (!queue.isEmpty()){
            int size = queue.size();
            while (size--!=0){
                int index[] = queue.poll();
                int x =index[0];
                int y = index[1];
                if(grid[x][y]=='#')return step;
                for (int d[]: dir){
                    int newX = x+d[0];
                    int newY = y+d[1];
                    if(newX<0||newX>=grid.length||newY<0||newY>=grid[0].length||grid[newX][newY]=='X'||visited[newX][newY])continue;
                    visited[newX][newY]=true;
                    queue.add(new int[]{x+d[0],y+d[1]});
                }

            }
            step++;
        }
        return -1;

    }
}

