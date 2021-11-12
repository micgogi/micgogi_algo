import java.io.BufferedReader;
import java.util.Stack;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 11/12/2021  6:50 PM
 * Rahul Gogyani
 */
public class LinkedListpalindorme {
    static Node head;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            next=null;
        }
    }
    public static void main(String args[]) {
       head = new Node(1);
       head.next = new Node(2);
       head.next.next = new Node(3);
       head.next.next.next = new Node(4);
       head.next.next.next.next = new Node(3);
       head.next.next.next.next.next = new Node(8);
       head.next.next.next.next.next.next = new Node(1);
        System.out.println(checkPalindrome(head));
    }

    public static boolean checkPalindrome(Node temp){
        Stack<Integer>stack = new Stack<>();
        Node temp1 = temp;
        while (temp!=null){
            stack.push(temp.data);
            temp=temp.next;
        }
        System.out.println(stack);
        while (!stack.isEmpty()){
            if(stack.pop()!=temp1.data){
                return false;
            }
            temp1=temp1.next;
        }
        return true ;


    }



}

