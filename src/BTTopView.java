import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.TreeMap;

/**
 * @author Micgogi
 * on 1/5/2022  12:30 PM
 * Rahul Gogyani
 */
public class BTTopView {
    static Node root;

    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }

    public static void main(String args[]) {
        root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        TreeMap<Integer,Integer> map = new TreeMap<>();
        dfs(root,0,map);
       // System.out.println(map);
        for(int val:map.keySet()){
            System.out.print(map.get(val)+" ");
        }
    }

    public static void dfs(Node root, int level, TreeMap<Integer,Integer> map){
        if(root==null)return;
        if(!map.containsKey(level))map.put(level,root.data);
        dfs(root.left,level-1,map);
        dfs(root.right,level+1,map);
    }


}

