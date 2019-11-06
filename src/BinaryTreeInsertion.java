import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeInsertion {
    static  Node root;
    static class Node{
        int data;
        Node right;
        Node left;
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static void inOrder(Node root){
        if(root!=null){

            inOrder(root.left);
            System.out.print(root.data);
            inOrder(root.right);
        }
    }
    public static void main(String[] args) {

       root = Insert(root,1);
       root = Insert(root,2);
       root = Insert(root,3);
       root = Insert(root,4);

        inOrder(root);

    }
    public static Node Insert(Node temp, int data){

        if(temp == null){
            temp = new Node(data);
            return temp;
        }
        if(data<temp.data){
            temp.left = Insert(temp.left,data);
        }else if(data>=temp.data){
            temp.right =  Insert(temp.right,data);
        }

            return temp;

    }
}
