import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 10/26/2021  12:47 PM
 * Rahul Gogyani
 */
public class LC226Test {
    static Node root;
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data = data;
        }
    }
    public static void main(String args[]) {
        root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        Node n = invertBinaryTree(root);
        preorder(n);

    }
    public static Node invertBinaryTree(Node root){
        if(root == null)return null;
        Node node = new Node(root.data);
        node.left = invertBinaryTree(root.right);
        node.right = invertBinaryTree(root.left);
        return node;
    }
    public static void preorder(Node root){
        if(root!=null){
            System.out.println(root.data);
            preorder(root.left);
            preorder(root.right);
        }
    }

}

