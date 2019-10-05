import java.util.Stack;

public class LinkedListPAlindrome {
   static Node head;

    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next= null;
        }
    }
    public static boolean checkPalindrone(Node temp){
        boolean flag = true;
        Stack<Integer> stack = new Stack<>();
        while(temp!=null){
            stack.push(temp.data);
            temp=temp.next;
        }
        while(head!=null){
            int n = stack.pop();
            if(n==head.data){
                flag=true;


            }
            else{
                flag = false;
                break;
            }
            head=head.next;



        }
        return flag;
    }
    public static void main(String args[]){
        head = new Node(1);
        head.next = new Node (2);
        head.next.next = new Node(3);
        head.next.next = new Node(1);
        System.out.println(checkPalindrone(head));

    }
}
