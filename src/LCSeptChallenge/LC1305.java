package LCSeptChallenge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Micgogi
 * on 9/5/2020  1:48 PM
 * Rahul Gogyani
 */
public class LC1305 {
    static Node root1;
    static Node root2;
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data = data;
        }
    }
    public static void main(String args[]) {
        root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(4);
        root2 = new Node(1);
        root2.left = new Node(0);
        root2.right = new Node(3);
        List<Integer> list = new ArrayList<>();
        dfs(root1,list);
        dfs(root2,list);
        Collections.sort(list);
        System.out.println(list);

    }
    public static void dfs(Node root,List<Integer> list){
        if(root!=null){
            list.add(root.data);
            dfs(root.left,list);
            dfs(root.right,list);
        }
    }


}

