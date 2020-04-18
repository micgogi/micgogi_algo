import java.util.Stack;

/**
 * @author Micgogi
 * on 4/18/2020  9:56 AM
 * Rahul Gogyani
 */
public class LC232 {

    Stack<Integer> stack1;
    Stack<Integer> stack2;

    public LC232() {

        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }


    /**
     * Push element x to the back of queue.
     */
    public void push(int x) {
        stack1.push(x);
    }

    /**
     * Removes the element from in front of queue and returns that element.
     */
    public int pop() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    /**
     * Get the front element.
     */
    public int peek() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.peek();
    }

    /**
     * Returns whether the queue is empty.
     */
    public boolean empty() {
        return stack2.isEmpty() && stack1.isEmpty();
    }
}
