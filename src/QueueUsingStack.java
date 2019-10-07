import java.util.Stack;

public class QueueUsingStack {
   static  Stack<Integer> s1 = new Stack<>();
   static Stack<Integer> s2 = new Stack<>();
    public static void main(String args[]){
        enqueue(1);
        enqueue(2);
        enqueue(3);
        dequeue();
    }
    public static  void enqueue(int x){

        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        s1.push(x);
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }

    }
    public static void  dequeue(){
        if(s1.isEmpty()){
            System.out.println("No elements");
        }
        int x = s1.peek();
        System.out.println(x);
        s1.pop();


    }
}
