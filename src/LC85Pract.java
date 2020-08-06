import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 8/6/2020  11:17 AM
 * Rahul Gogyani
 */
public class LC85Pract {
    public static void main(String args[]) {
        int matrix[][] = {{1, 0, 1, 0, 0},
                {1, 0, 1, 1, 1},
                {1, 1, 1, 1, 1},
                {1, 0, 0, 1, 0}};
        System.out.println(maximalRectangle(matrix));

    }

    public static int maximalRectangle(int [][] matrix) {
        int b[] = new int[matrix[0].length];
        int area =0;
        int max =0;
        for (int i = 0; i <matrix.length; i++) {
            for (int j = 0; j <matrix[0].length ; j++) {
                if(matrix[i][j]==1){
                    b[j]+=matrix[i][j];
                }else{
                    b[j]=0;
                }
            }
            area = histogram(b);
            if(area>max)max=area;

        }
        //System.out.println(max);
        return max;
    }

    public static int histogram(int heights[]) {
        Stack<Integer> stack = new Stack<>();
        int max = 0;
        int i = 0;
        while (i < heights.length) {
            if (stack.isEmpty() || heights[i] >= heights[stack.peek()]) {
                stack.push(i);
                i++;
            } else {
                int curmax = heights[stack.pop()];
                int area = curmax * (stack.isEmpty() ? i : i - 1 - stack.peek());
                if (area > max) {
                    max = area;
                }
            }
        }
        while (!stack.isEmpty()) {
            int curmax = heights[stack.pop()];
            int area = curmax * (stack.isEmpty() ? i : i - 1 - stack.peek());
            if (area > max) {
                max = area;
            }
        }
        return max;
    }


}

