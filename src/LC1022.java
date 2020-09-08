import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 9/8/2020  9:41 PM
 * Rahul Gogyani
 */
public class LC1022 {
    static Node root;
    static class Node{
        int data;
        Node left;
        Node right;
        public Node (int data){
            this.data = data;
        }
    }
    public static void main(String args[]) {
       root = new Node(1);
       root.left = new Node(0);
       root.right = new Node(1);
       root.left.left = new Node(0);
       root.left.right = new Node(1);
       root.right.left = new Node(0);
       root.right.right = new Node(1);
       dfs(root,0);
        System.out.println(sum);

    }
    static int sum = 0;
    public static void dfs(Node root, int val){
        if(root==null)return;
        if(root.left==null&&root.right==null){
            val = (val*2)+ root.data;
            sum+= val;
        }
        int current = (val*2)+ root.data;
        dfs(root.left,current);
        dfs(root.right,current);


    }


}

