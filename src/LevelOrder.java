import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LevelOrder {
    static Node  root;
    static  class Node{
        int data;
        Node left; Node right;
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void level(Node temp){
        Queue<Node> q = new LinkedList<>();
        ArrayList<Integer> a = new ArrayList();
        if(temp==null){
            return;
        }else{
            q.add(temp);
        }
        while(!q.isEmpty()){
            Node n = q.poll();
            a.add(n.data);
            if(n.left!=null){
                q.add(n.left);
            }
            if(n.right!=null){
                q.add(n.right);
            }
        }
       for(Integer i:a){
           System.out.print(i+" ");
       }
    }
    public static void main(String[] args) {
        root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        level(root);



    }
}
