import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Micgogi
 * on 4/18/2020  10:09 AM
 * Rahul Gogyani
 */
public class LC225 {

    Queue<Integer> q1;

    public LC225(){
        q1 = new LinkedList<>();

    }

    /** Push element x onto stack. */
    public void push(int x) {
        q1.add(x);
        for (int i = 0; i <q1.size()-1 ; i++) {
            q1.add(q1.poll());
        }
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return q1.poll();
    }

    /** Get the top element. */
    public int top() {
        return q1.peek();
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return q1.isEmpty();
    }


}

