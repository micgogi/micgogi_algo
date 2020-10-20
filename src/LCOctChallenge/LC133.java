package LCOctChallenge;

import java.util.*;

/**
 * @author Micgogi
 * on 7/30/2020  11:16 AM
 * Rahul Gogyani
 */
public class LC133 {
    static Node root;
    static class Node{
        public int val;
        public List<Node> neighbors;

        public Node() {
            val = 0;
            neighbors = new ArrayList<Node>();
        }

        public Node(int _val) {
            val = _val;
            neighbors = new ArrayList<Node>();
        }

        public Node(int _val, ArrayList<Node> _neighbors) {
            val = _val;
            neighbors = _neighbors;
        }
    }
    public static void main(String args[]) {
        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        Node four = new Node(4);
        one.neighbors = Arrays.asList(two,four);
        two.neighbors = Arrays.asList(three,four);
        three.neighbors = Arrays.asList(two,four);
        four.neighbors = Arrays.asList(one,three);
        cloneGraph(one);

    }
    static Map<Node,Node> map = new HashMap<>();
    public static Node cloneGraph(Node node) {
        if(node==null)return null;
        if(map.containsKey(node)){
            return map.get(node);
        }
        Node temp = new Node(node.val,new ArrayList<>());
        map.put(node,temp);

        for (Node neighbour:node.neighbors){
            temp.neighbors.add(cloneGraph(neighbour));
        }

        return map.get(node);

    }
}

