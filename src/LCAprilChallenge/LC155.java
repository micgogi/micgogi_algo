package LCAprilChallenge;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author Micgogi
 * on 4/10/2020  1:15 PM
 * Rahul Gogyani
 */
public class LC155 {
    Deque<Integer> dq = new LinkedList<>();
    public static void main(String[] args) {

    }

   int min = Integer.MAX_VALUE;

    public void push(int x) {
        if(x<=min){
            dq.push(min);
            min = x;

        }
        dq.push(x);
    }

    public void pop() {
        int peek = dq.pop();
        if(peek==min)dq.pop();
    }

    public int top() {
       return dq.peek();
    }

    public int getMin() {
        return min;
    }
}
