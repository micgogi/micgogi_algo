import com.sun.java.swing.plaf.windows.WindowsTextAreaUI;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;

public class TopLevelOrder {
    static Node root;
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void topLevel(Node temp){
        class Quobj{
            Node n;
            int level;
            public Quobj(Node n , int level){
                this.level = level;
                this.n = n;
            }
        }
        Queue<Quobj> q = new LinkedList<>();
        TreeMap<Integer, Node> tm = new TreeMap<>();
        if(temp == null){
            return ;
        }else{
            q.add(new Quobj(temp,0));
        }

        while (!q.isEmpty()){
            Quobj q1 = q.poll();
            if(!tm.containsKey(q1.level)){
                tm.put(q1.level,q1.n);
            }
            if(q1.n.left!=null){
                q.add(new Quobj(q1.n.left,q1.level-1));
            }
            if(q1.n.right!=null){
                q.add(new Quobj(q1.n.right,q1.level+1));
            }
        }
        Set<Integer> s = tm.keySet();
        for(int i: s){
            System.out.print(tm.get(i).data+" ");
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
        topLevel(root);



    }
}
