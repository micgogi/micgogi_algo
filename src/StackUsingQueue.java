import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);;
        s.push(2);
        s.push(3);
        s.pop();
        System.out.println(s.top());
    }
}
class Stack{
    static Queue<Integer> q1 = new LinkedList<>();
    static Queue<Integer> q2 = new LinkedList<>();

    static int currentSize;

    Stack(){
        currentSize=0;
    }
    static  void push(int x){
        currentSize++;
        q2.add(x);
        while(!q1.isEmpty()){
            q2.add(q1.peek());
            q1.remove();
        }
        Queue<Integer> q = q1;
        q1=q2;
        q2=q;
    }
    static void pop(){
        if(q1.isEmpty()){
           return;
        }
        q1.remove();
        currentSize--;

    }
    static int top(){
        if(q1.isEmpty()){
            return -1;
        }
        return q1.peek();
    }
    static  int size(){
        return currentSize;
    }
}
