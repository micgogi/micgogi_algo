import java.util.Stack;

/**
 * @author Micgogi
 * on 3/9/2020  11:49 PM
 * Rahul Gogyani
 *
 *
 * if (stack[empty]){
 *     area = intput[top]*i
 * }
 *else{
 *     area= intput[top]*(i-1-stacktop)
 * }
 *
 *
 */
public class LC84 {
    public static void main(String[] args) {
        int a[] = {2,1,5,6,2,3};
        Stack<Integer> stack = new Stack<>();
        int max=0;
        int i=0;
        while(i<a.length){
         if(stack.isEmpty()||a[stack.peek()]<=a[i]){
             stack.push(i);
             i++;
         }else{
             int currMax = stack.pop();
             int area = a[currMax]*(stack.isEmpty()?i:i-1-stack.peek());
             if(area>max)max=area;
         }
        }
        while(!stack.isEmpty()){
            int currMax = stack.pop();
            int area = a[currMax]*(stack.isEmpty()?i:i-1-stack.peek());
            if(area>max)max=area;
        }
        System.out.println(max);
    }
}
