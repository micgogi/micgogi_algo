import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 8/6/2020  10:37 AM
 * Rahul Gogyani
 */
public class LC84Pract {
    public static void main(String args[]) {
        int a[] = {65, 78, 75, 73, 84, 65};
        System.out.println(largestRectangleArea(a));

    }

    public static int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int max =0;
        int i =0;
        while (i<heights.length){
            if(stack.isEmpty()||heights[stack.peek()]<=heights[i]){
                stack.push(i);
                i++;
            }else{
                int curMax = stack.pop();
                int area = heights[curMax]*(stack.isEmpty()?i:i-1-stack.peek());
                if(area>max){
                    max = area;
                }
            }
        }
        while (!stack.isEmpty()){
            int curMax = stack.pop();
            int area = heights[curMax]*(stack.isEmpty()?i:i-1-stack.peek());
            if(area>max){
                max = area;
            }
        }

        return max;
    }

}

