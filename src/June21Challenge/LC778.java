package June21Challenge;

import java.util.PriorityQueue;

/**
 * @author Micgogi
 * on 6/20/2021  2:02 PM
 * Rahul Gogyani
 */
public class LC778 {
    public static void main(String args[]) {
        int[][] grid = new int[][]{{0,1,2,3,4},{24,23,22,21,5},{12,13,14,15,16},{11,17,18,19,20},{10,9,8,7,6}};
        System.out.println(swimInWater(grid));
    }

    public static int swimInWater(int[][] grid) {
        int n= grid.length;
        PriorityQueue<int[]> priorityQueue = new PriorityQueue<>((a,b)->a[2]-b[2]);
        boolean[][] visited = new boolean[n][n];
        int[][] d = new int[][]{{0,1},{1,0},{-1,0},{0,-1}};
        priorityQueue.add(new int[]{0,0,grid[0][0]});
        visited[0][0] = true;
        while (!priorityQueue.isEmpty()){
            int[] temp = priorityQueue.poll();
            int i = temp[0];
            int j = temp[1];
            int max = temp[2];
            for (int[] dir:d){
                int newI = i+dir[0];
                int newJ = j+dir[1];
                if(newI<0 || newI>=n||newJ<0||newJ>=n)continue;;
                if(!visited[newI][newJ]){
                    visited[newI][newJ] = true;
                    int newMax = Math.max(max,grid[newI][newJ]);
                    if(newI==n-1 && newJ==n-1)return newMax;
                    priorityQueue.offer(new int[]{newI,newJ,newMax});
                }
            }
        }
        return 0;
    }

}

