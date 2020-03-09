import java.util.Stack;

/**
 * @author Micgogi
 * on 3/10/2020  1:01 AM
 * Rahul Gogyani
 */
public class LC85 {
    public static void main(String[] args) {
        char c[][] = {{'1', '0', '1', '0', '0'}, {'1', '0', '1', '1', '1'}, {'1', '1', '1', '1', '1'}, {'1', '0', '0', '1', '0'}};
        int a[][]=new int[c.length][c[0].length];
        for (int i = 0; i <c.length ; i++) {
            for (int j = 0; j <c[0].length ; j++) {
                a[i][j]=Integer.parseInt(""+c[i][j]);
            }
        }
        int b[] = new int[a[0].length];
        int max = 0;
        int area = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i][j]==0){
                    b[j]=0;
                }else{b[j]+=a[i][j];
                }
            }
            area= histogram(b);
            if(area>max){
                max=area;
            }
        }
        System.out.println(max);
    }

    public static int histogram(int a[]) {
        Stack<Integer> stack = new Stack<>();
        int max = 0;
        int i = 0;
        while (i < a.length) {
            if (stack.isEmpty() || a[stack.peek()] <= a[i]) {
                stack.push(i);
                i++;
            } else {
                int currMax = stack.pop();
                int area = a[currMax] * (stack.isEmpty() ? i : i - 1 - stack.peek());
                if (area > max) max = area;
            }
        }
        while (!stack.isEmpty()) {
            int currMax = stack.pop();
            int area = a[currMax] * (stack.isEmpty() ? i : i - 1 - stack.peek());
            if (area > max) max = area;
        }
        return max;
    }
}
