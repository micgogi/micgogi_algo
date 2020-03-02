/*
 *@author Rahul Gogyani

 *
 * 3:36 PM 3/2/2020
 */


import java.util.LinkedList;
import java.util.Queue;

public class ShortestPathInABinaryMaze {
    final static int ROW = 9;
    final static int COL = 10;
    static class Point {
        int x, y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    static class Node {
        Point point;
        int d;

        public Node(Point point, int d) {
            this.point = point;
            this.d = d;

        }
    }

    static boolean isValid(int row, int col){
        return (row>=0 && row<ROW && col>=0 && col<COL);
    }

//up, left, down ,right
    static int rowNum[]={-1,0,0,1};
    static  int colNum[] = {0,-1,1,0};

    static int BFS(int a[][], Point src, Point dest){
        if(a[src.x][src.y]!=1||a[dest.x][dest.y]!=1){
            return -1;
        }

        boolean visited[][] = new boolean[ROW][COL];
        visited[src.x][src.y] = true;
        Queue<Node> queue = new LinkedList<>();
        Node n = new Node(src,0);
        queue.add(n);
        while(!queue.isEmpty()){
            Node cn = queue.peek();
            queue.remove();
            Point point = cn.point;
            if(point.x==dest.x&&point.y==dest.y)return cn.d;

            for (int i = 0; i <4 ; i++) {
                int row = rowNum[i]+point.x;
                int col = colNum[i]+point.y;

                if(isValid(row,col)&&a[row][col]==1&&!visited[row][col]){
                    visited[row][col]=true;

                    Node nn = new Node(new Point(row,col),cn.d+1);
                    queue.add(nn);
                }

            }


        }
        return -1;
    }
    public static void main(String[] args) {
        int a[][] = {{1, 0, 1, 1, 1, 1, 0, 1, 1, 1},
                {1, 0, 1, 0, 1, 1, 1, 0, 1, 1},
                {1, 1, 1, 0, 1, 1, 0, 1, 0, 1},
                {0, 0, 0, 0, 1, 0, 0, 0, 0, 1},
                {1, 1, 1, 0, 1, 1, 1, 0, 1, 0},
                {1, 0, 1, 1, 1, 1, 0, 1, 0, 0},
                {1, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                {1, 0, 1, 1, 1, 1, 0, 1, 1, 1},
                {1, 1, 0, 0, 0, 0, 1, 0, 0, 1}};

        System.out.println(BFS(a,new Point(0,0),new Point(3,4)));

    }
}
