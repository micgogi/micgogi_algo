package Graph;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Micgogi
 * on 4/28/2020  11:45 AM
 * Rahul Gogyani
 */
public class DisjointSetPract {
    Map<Integer,Node> map = new HashMap<>();
    class Node{
        int data;
        int rank;
        Node parent;
    }
    public void makeSet(int data){
        Node node = new Node();
        node.data = data;
        node.parent = node;
        node.rank = 0;
        map.put(data, node);
    }
    public int findSet(int data){
        return findSet( map.get(data)).data;
    }
    public Node findSet(Node n){
        Node parent = n.parent;
        if(parent==n){
            return parent;
        }
        n.parent = findSet(n.parent);
        return n.parent;
    }

    public boolean union(int a, int b){
        Node node1 = map.get(a);
        Node node2 = map.get(b);
        Node parent1 = findSet(node1);
        Node parent2 = findSet(node2);
        if(parent1.data == parent2.data){
            return false;
        }
        if(parent1.rank>=parent2.rank){
            parent1.rank=parent1.rank==parent2.rank?parent1.rank+1:parent1.rank;
            parent2.parent = parent1;
        }else{
            parent1.parent=parent2;
        }
        return true;
    }

    public static void main(String[] args) {
        DisjointSetPract ds = new DisjointSetPract();
        ds.makeSet(1);
        ds.makeSet(2);
        ds.makeSet(3);
        ds.makeSet(4);
        ds.makeSet(5);
        ds.makeSet(6);
        ds.makeSet(7);
        ds.union(1, 2);
        ds.union(2, 3);
        ds.union(4, 5);
        ds.union(6, 7);
        ds.union(5, 6);
        ds.union(3, 7);
        System.out.println(ds.findSet(1));
        System.out.println(ds.findSet(2));
        System.out.println(ds.findSet(3));
        System.out.println(ds.findSet(4));
        System.out.println(ds.findSet(5));
        System.out.println(ds.findSet(6));
        System.out.println(ds.findSet(7));
    }

}
