package DP;/*
 *@author Ragul Gogyani

 *
 * 1:45 PM 3/2/2020
 */

public class RatInAMaze {


    static  boolean solveMaze(int a[][]) {
        int sol[][] = new int[a.length][a[0].length];
        if (solveMazeUtil(a, 0, 0, sol)) {
            printSolution(sol);
            return true;
        } else {
            return false;
        }
    }
  static   void printSolution(int sol[][])
    {
        for (int i = 0; i < sol.length; i++) {
            for (int j = 0; j < sol[0].length; j++)
                System.out.print(" " + sol[i][j] + " ");
            System.out.println();
        }
    }

    static boolean solveMazeUtil(int a[][], int x, int y, int sol[][]) {
        if (x == a.length - 1 && y == a[0].length - 1) {
            if(isSafe(a,x,y)) {
                sol[x][y] = 1;
                return true;
            }
        }
        if(isSafe(a,x,y)) {
            sol[x][y]=1;
            if (solveMazeUtil(a, x + 1, y, sol)) {
                return true;
            }
            if(solveMazeUtil(a,x,y+1,sol)){
                return true;
            }



            sol[x][y]=0;
            return false;
        }
        return false;
    }

    static boolean isSafe(int maze[][], int x, int y)
    {
        return (x >= 0 && x < maze.length && y >= 0 && y<maze[0].length && maze[x][y] == 1);
    }

    public static void main(String[] args) {

        int maze[][] = {{1, 0, 0, 0},
                {1, 1, 0, 0},
                {0, 1, 1, 0},
                {1, 1, 1, 1}};
        System.out.println(solveMaze(maze));


    }
}
