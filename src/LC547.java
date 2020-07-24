import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 7/24/2020  4:17 PM
 * Rahul Gogyani
 */
public class LC547 {
    public static void main(String args[]) {
        int[][] M = {{1,1,0},{1,1,0},{0,0,1}};
       int[] visited = new int[M.length];
       int count =0;
        for(int i=0;i<M.length;i++){

                if(visited[i]==0){
                    dfs(M,visited,i);
                    count++;
                }

        }
        System.out.println(count);
    }

    public static void dfs(int[][]M, int[] visited, int i){
        for (int j = 0; j <M.length ; j++) {
            if(M[i][j]==1&&visited[j]==0){
                visited[j]=1;
                dfs(M, visited, j);
            }
        }
    }


}

